FROM openjdk:21-jdk-slim

# Installation du client MySQL
RUN apt-get update && apt-get install -y mysql-client

# Set the working directory in the container
WORKDIR /app

# Argument for the JAR file
ARG JAR_FILE=target/*.jar

# Copy the JAR file into the container
COPY ${JAR_FILE} app.jar

# Expose the port the application runs on
EXPOSE 8087

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]

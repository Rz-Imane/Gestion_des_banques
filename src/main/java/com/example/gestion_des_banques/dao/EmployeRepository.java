package com.example.gestion_des_banques.dao;

import com.example.gestion_des_banques.entities.Employe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories("com.example.gestion_des_banques.dao")
public interface EmployeRepository extends JpaRepository <Employe,Integer> {
    Page<Employe> findByNomContainsOrPrenomContains(String nom, String prenom, Pageable pageable);

}

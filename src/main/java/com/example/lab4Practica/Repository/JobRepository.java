package com.example.lab4Practica.Repository;


import com.example.lab4Practica.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface JobRepository extends JpaRepository<Job,String> {
}

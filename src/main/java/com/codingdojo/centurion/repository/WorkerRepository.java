package com.codingdojo.centurion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.centurion.model.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
    // Future custom methods can be defined here as needed
}

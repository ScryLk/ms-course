package org.example.repositories;

import org.example.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.Table;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}

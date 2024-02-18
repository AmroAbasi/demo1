package com.example.demo.repository;

import com.example.demo.entities.task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface taskRepository extends JpaRepository<task,Long> {
}

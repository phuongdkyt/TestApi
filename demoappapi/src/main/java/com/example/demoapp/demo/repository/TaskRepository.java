package com.example.demoapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskRepository,Integer> {
}

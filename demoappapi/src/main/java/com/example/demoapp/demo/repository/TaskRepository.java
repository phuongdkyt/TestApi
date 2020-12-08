package com.example.demoapp.demo.repository;

import com.example.demoapp.demo.model.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity,Integer> {
}

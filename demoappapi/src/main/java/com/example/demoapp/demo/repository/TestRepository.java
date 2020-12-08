package com.example.demoapp.demo.repository;

import com.example.demoapp.demo.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity,Integer> {
}

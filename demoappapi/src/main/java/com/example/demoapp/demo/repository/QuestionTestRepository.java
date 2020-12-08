package com.example.demoapp.demo.repository;

import com.example.demoapp.demo.model.QuestionTestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionTestRepository extends JpaRepository<QuestionTestEntity,Integer> {
}

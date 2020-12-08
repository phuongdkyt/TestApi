package com.example.demoapp.demo.repository;

import com.example.demoapp.demo.model.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionEntity,Integer> {
}

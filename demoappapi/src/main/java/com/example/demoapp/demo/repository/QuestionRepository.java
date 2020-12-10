package com.example.demoapp.demo.repository;

import com.example.demoapp.demo.model.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity,Integer> {

}

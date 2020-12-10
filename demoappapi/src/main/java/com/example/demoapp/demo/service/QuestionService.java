package com.example.demoapp.demo.service;

import com.example.demoapp.demo.model.QuestionEntity;
import com.example.demoapp.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;
    public List<QuestionEntity> read(){
        return questionRepository.findAll();
    }
    public void save(List<QuestionEntity> questionListEntity){
        questionRepository.saveAll(questionListEntity);
    }
}

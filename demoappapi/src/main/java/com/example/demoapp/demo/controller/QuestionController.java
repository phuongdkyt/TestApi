package com.example.demoapp.demo.controller;

import com.example.demoapp.demo.model.QuestionEntity;
import com.example.demoapp.demo.model.RoleEntity;
import com.example.demoapp.demo.model.UserEntity;
import com.example.demoapp.demo.repository.QuestionRepository;
import com.example.demoapp.demo.repository.UserRepository;
import com.example.demoapp.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/question", produces = "application/json")
@CrossOrigin(origins = "*")
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public List<QuestionEntity> read(){
        return questionService.read();
    }

    @GetMapping("/{id}")
    public QuestionEntity userById(@PathVariable(value = "id", required = false) int id) {
        Optional<QuestionEntity> optionalQuestion = questionRepository.findById(id);
        if (optionalQuestion.isPresent()) {
            return optionalQuestion.get();
        }
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id", required = false) int id) {
        try {
            questionRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
        }
    }

    @PostMapping("/add-question/{level}")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveQuestion(@RequestBody List<QuestionEntity> questionListEntity,
    @PathVariable(value = "level", required = false) String level
    ) {
        Optional<UserEntity> userEntity= userRepository.findById(1);
        for(int i=0;i<questionListEntity.size();i++){
            questionListEntity.get(i).setUser(userEntity.get());
            questionListEntity.get(i).setLevel(level);
        }
        questionService.save(questionListEntity);
    }
}
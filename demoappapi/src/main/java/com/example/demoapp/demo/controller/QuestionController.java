package com.example.demoapp.demo.controller;

import com.example.demoapp.demo.model.QuestionEntity;
import com.example.demoapp.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping(path = "/question", produces = "application/json")
@CrossOrigin(origins = "*")
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping
    public Iterable<QuestionEntity> getAllQuestion() {
        return questionRepository.findAll();
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

    @PostMapping("/add-question")
    @ResponseStatus(HttpStatus.CREATED)
    public QuestionEntity saveQuestion(@RequestBody QuestionEntity questionEntity) {
        return questionRepository.save(questionEntity);
    }

}
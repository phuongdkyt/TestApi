package com.example.demoapp.demo.controller;

import com.example.demoapp.demo.model.TestEntity;
import com.example.demoapp.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/test", produces = "application/json")
@CrossOrigin(origins = "*")
public class TestController {
    @Autowired
    private TestRepository testRepository;

    @GetMapping
    public Iterable<TestEntity> getAllTest() {
        return testRepository.findAll();
    }

    @GetMapping("/{id}")
    public TestEntity testById(@PathVariable(value = "id", required = false) int id) {
        Optional<TestEntity> optionalTestEntity = testRepository.findById(id);
        if (optionalTestEntity.isPresent()) {
            return optionalTestEntity.get();
        }
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id", required = false) int id) {
        try {
            testRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {

        }
    }

    @PostMapping("/add-test")
    @ResponseStatus(HttpStatus.CREATED)
    public TestEntity saveEntity(@RequestBody TestEntity testEntity) {
        return testRepository.save(testEntity);
    }

}
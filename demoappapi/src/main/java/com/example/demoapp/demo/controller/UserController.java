package com.example.demoapp.demo.controller;

import com.example.demoapp.demo.model.UserEntity;
import com.example.demoapp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/user", produces = "application/json")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Iterable<UserEntity> getAllUser(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public UserEntity userById(@PathVariable(value = "id", required = false) int id){
        Optional<UserEntity> optionalUserEntity = userRepository.findById(id);
        if(optionalUserEntity.isPresent()){
            return optionalUserEntity.get();
        }
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id", required = false) int id){
        try {
            userRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){}
    }

    @PostMapping("/add-user")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity saveUser(@RequestBody UserEntity userEntity){
        return userRepository.save(userEntity);
    }

}

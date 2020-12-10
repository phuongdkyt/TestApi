package com.example.demoapp.demo.repository;

import com.example.demoapp.demo.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    @Override
    Optional<UserEntity> findById(Integer integer);
}

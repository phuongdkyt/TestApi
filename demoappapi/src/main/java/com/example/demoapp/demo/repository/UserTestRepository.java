package com.example.demoapp.demo.repository;

import com.example.demoapp.demo.model.UserEntity;
import com.example.demoapp.demo.model.UserTestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTestRepository extends JpaRepository<UserTestEntity,Integer> {
}

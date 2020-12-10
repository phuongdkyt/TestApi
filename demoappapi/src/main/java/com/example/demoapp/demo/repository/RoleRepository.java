package com.example.demoapp.demo.repository;

import com.example.demoapp.demo.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Integer> {
    @Override
    Optional<RoleEntity> findById(Integer integer);
}

package com.example.demoapp.demo.repository;

import com.example.demoapp.demo.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity,Integer> {
}

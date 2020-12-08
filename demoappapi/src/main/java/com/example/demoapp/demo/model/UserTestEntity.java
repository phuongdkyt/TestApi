package com.example.demoapp.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "tbl_test_user")
public class UserTestEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public Integer id;

   @ManyToOne
   @JoinColumn(name = "user_id")
   private  UserEntity user;
   @ManyToOne
   @JoinColumn(name = "test_entity")
   private  TestEntity test;

}

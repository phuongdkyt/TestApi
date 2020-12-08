package com.example.demoapp.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "tbl_test_user")
public class UserTestEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public Integer id;

   @JsonIgnore
   @ManyToOne
   @JoinColumn(name = "user_id")
   private  UserEntity user;

   @JsonIgnore
   @ManyToOne
   @JoinColumn(name = "test_entity")
   private  TestEntity test;

}

package com.example.demoapp.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private  String password;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;

    @OneToMany(mappedBy = "user")
    private List<UserEntity> userEntityList=new ArrayList<>();

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToMany(mappedBy = "user")
    private List<QuestionEntity> questionEntityList=new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<TaskEntity> taskEntityList=new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<TestEntity> testEntities=new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<UserTestEntity> userTestEntityList=new ArrayList<>();

}

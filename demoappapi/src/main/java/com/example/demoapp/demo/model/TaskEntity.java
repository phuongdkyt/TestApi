package com.example.demoapp.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity user;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "test_id")
    TestEntity test;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "question_id")
    QuestionEntity question;

    @Column(nullable = false)
    private String taskAwnser;

}

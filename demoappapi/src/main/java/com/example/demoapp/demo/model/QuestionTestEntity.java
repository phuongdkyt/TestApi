package com.example.demoapp.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "tbl_test_question")
public class QuestionTestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "test_id")
    private TestEntity test;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionEntity question;
}

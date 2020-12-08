package com.example.demoapp.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_test_question")
public class QuestionTestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



    @ManyToOne
    @JoinColumn(name = "test_id")
    private TestEntity test;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionEntity question;
}

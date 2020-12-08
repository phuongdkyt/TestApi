package com.example.demoapp.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

//@Entity
//@Table(name = "tbl_cauhoi")
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String answer;
    private String level;

    private String questionType;



}

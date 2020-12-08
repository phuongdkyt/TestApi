package com.example.demoapp.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_test")
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String testName;
    @Column(nullable = false)
    private Integer testTime;
    private Date testDate;

    @OneToMany(mappedBy = "test")
    List<TaskEntity> taskEntityList=new ArrayList<>();

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity user;

    @OneToMany(mappedBy = "test")
    private List<UserTestEntity> userTestEntityList=new ArrayList<>();

    @OneToMany(mappedBy = "test")
    private List<QuestionTestEntity> questionTestEntityList=new ArrayList<>();

}

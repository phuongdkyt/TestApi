package com.example.demoapp.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

//@Entity
//@Table(name = "tbl_hv_baithi")
public class UserTestEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public Integer id;


}

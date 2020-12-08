package com.example.demoapp.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,unique = true)
    private String roleName;

    @OneToMany(mappedBy = "role")
    private List<UserEntity> userEntityList =new ArrayList<>();
}

package com.example.fullstacktry.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int   id;
    @Column(name = "name",unique = true)
    private String name;
    @Column(name = "email" ,unique = true)
    private String email;
    @Column(name = "password")
    private String password;


}

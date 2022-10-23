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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "names",unique = true, nullable = false)
    private String name;
    @Column(name = "emails" ,unique = true,nullable = false)
    private String email;
    @Column(name = "passwords", nullable = false)
    private String password;



}

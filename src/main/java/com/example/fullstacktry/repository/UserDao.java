package com.example.fullstacktry.repository;

import com.example.fullstacktry.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserDao extends JpaRepository<User, Integer> {


    Optional<User> getByNameAndPassword(String name,String password);
    Optional<User> getByNameAndEmail(String name,String email);

    Optional<User> getByName(String name);
    Optional<User> getByEmail(String name);
}

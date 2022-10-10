package com.example.fullstacktry.service;

import com.example.fullstacktry.entities.User;
import com.example.fullstacktry.repository.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.OK;

@AllArgsConstructor
@Service
public class UserService {

    private UserDao userDao;

    public void add(User user) {
        this.userDao.save(user);
    }

    public String check(String username, String password) {
      Optional<User> user = this.userDao.getByNameAndPassword(username, password);
        if(user.isEmpty()){
            return "loginpageinvalid";
        }
        return "homepage";

    }
}

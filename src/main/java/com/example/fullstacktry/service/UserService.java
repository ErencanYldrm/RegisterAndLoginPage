package com.example.fullstacktry.service;

import com.example.fullstacktry.entities.User;
import com.example.fullstacktry.repository.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {

    private UserDao userDao;

    public String add(User user) {
        Optional<User> users = this.userDao.getByNameAndEmail(user.getName(), user.getEmail());
        Optional<User> user1 = this.userDao.getByName(user.getName());
        Optional<User> user2 = this.userDao.getByEmail(user.getEmail());
        if (user1.isEmpty() && user2.isEmpty()) {
            this.userDao.save(user);
            return "loginpage";
        }
        if (user1.isPresent()) {
            return "registerinvalidusername";
        } else {
            return "registerinvalidemail";
        }

}



    public String loginCheck(String username, String password) {
      Optional<User> user = this.userDao.getByNameAndPassword(username, password);
        if(user.isEmpty()){
            return "loginpageinvalid";
        }
        return "homepage";
    }
}

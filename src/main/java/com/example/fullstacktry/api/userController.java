package com.example.fullstacktry.api;


import com.example.fullstacktry.entities.User;
import com.example.fullstacktry.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class userController {

    private UserService userService;

//    @GetMapping("/")
//    public String register(){
//        return "index";
//    }

    @GetMapping("/")
    public String userForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "register2";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user){
        return this.userService.add(user);
    }

    @GetMapping("/login")
    public String login(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "loginpage";
    }
    @PostMapping("/login")
    public String loginSystem(@ModelAttribute("user") User user) {
        return this.userService.loginCheck(user.getName(),user.getPassword());
    }




}

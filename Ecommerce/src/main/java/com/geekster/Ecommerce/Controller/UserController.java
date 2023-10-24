package com.geekster.Ecommerce.Controller;

import com.geekster.Ecommerce.Model.User;
import com.geekster.Ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("user")
    public String addUsers(@RequestBody User newUser){
        userService.addUsers(newUser);
        return "new user added";
    }

    // get user by userId
    @GetMapping("users/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
}

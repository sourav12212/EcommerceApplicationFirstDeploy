package com.geekster.Ecommerce.Service;

import com.geekster.Ecommerce.Model.User;
import com.geekster.Ecommerce.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public void addUsers(User newUser) {
        userRepo.save(newUser);
    }

    public User getUser(Integer id) {
        return userRepo.findById(id).orElseThrow();
    }
}

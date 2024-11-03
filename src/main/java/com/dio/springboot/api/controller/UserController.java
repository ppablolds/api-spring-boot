package com.dio.springboot.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dio.springboot.api.model.User;
import com.dio.springboot.api.repositories.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{username}")
    public User findOne(@PathVariable("username") String username) {
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody User user) {
        userRepository.save(user);
    }
}

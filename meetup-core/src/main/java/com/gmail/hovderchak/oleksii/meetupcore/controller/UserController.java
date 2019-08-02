package com.gmail.hovderchak.oleksii.meetupcore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.hovderchak.oleksii.meetupcore.document.User;
import com.gmail.hovderchak.oleksii.meetupcore.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public List<User> getAll() {
        return userRepository.findAll();
    }
}

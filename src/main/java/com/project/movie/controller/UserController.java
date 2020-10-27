package com.project.movie.controller;

import com.project.movie.dao.UserRepository;
import com.project.movie.document.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    @ResponseBody
    public List<User> findAllUser(){
        return userRepository.findAll();
    }
}

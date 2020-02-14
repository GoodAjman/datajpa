package com.ajman.springbootjpa.datajpa.controller;

import com.ajman.springbootjpa.datajpa.entity.User;
import com.ajman.springbootjpa.datajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//继承JpaRepository来完成对数据库的操作
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user=userRepository.getOne(id);
        return user;
    }

    @GetMapping("/insertUser")
    public User insertUser(User user){
        User save=userRepository.save(user);
        return save;
    }
}

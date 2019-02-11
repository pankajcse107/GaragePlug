package com.example.demo.controller;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.example.demo.userepository.UserRepo;


@RestController
@RequestMapping("/customer1")
public class UserController
{
    private UserService userService;
    @Autowired
     public  UserController(UserService userService)
    {
        this.userService = userService;
    }

    @DeleteMapping
    public void deleteAll()
    {
        userService.deleteAll();
    }
    @GetMapping("/get")
    public User findById(@RequestParam Long id)
    {
        return userService.findUser(id);
    }
    @PostMapping
    public void createUser(@RequestBody User user)
    {
        userService.createUser(user);
    }
    @GetMapping
    public Iterable<User> getAll()
    {
        return userService.findAll();
    }





}

package com.example.demo.service;

import com.example.demo.customer.User;
import com.example.demo.userepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@org.springframework.stereotype.Service
public class UserService
{

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo)
    {
        this.userRepo = userRepo;
    }


    public void deleteAll()
    {
         userRepo.deleteAll();
    }
    public void putStatus()
    {

    }

    public User save(User customer) {
         return userRepo.save(customer);
    }

    public Iterable<User> findAll() {
        return userRepo.findAll();
    }

    public User findById(Long id) {
        return userRepo.findById(id).get();
    }
}

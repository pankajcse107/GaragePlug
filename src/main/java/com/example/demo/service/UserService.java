package com.example.demo.service;

import com.example.demo.userepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

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
}

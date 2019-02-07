package com.example.demo.service;

import com.example.demo.customer.User;
import com.example.demo.userepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class UserService
{

    private UserRepo userRepo;
    private User user;

    @Autowired
    public UserService(UserRepo userRepo)
    {
        this.userRepo = userRepo;
    }


    public void deleteAll()
    {
         userRepo.deleteAll();
    }
    public User PostStatus(User user)
    {
      int i = user.getNo_of_orders();
      if(i >=10&& i<20)
      {
          System.out.println("You are promoted to gold");
      }
      else
          if(i>=20&&i<30)
          {
              System.out.println("you are promoted to planinum");
          }
          else
              System.out.println("regular");

      User userS = userRepo.save(user);
      return userS;
    }
}

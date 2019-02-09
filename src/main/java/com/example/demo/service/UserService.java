package com.example.demo.service;

import com.example.demo.entities.User;
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
   /* public User PostStatus(User user)
    {
      int i = user.getNoOfOrders();
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
    }*/
    public void updateCategory(User user)
    {
        int i = user.getNoOfOrders();
        if(i >=10&& i<20)
        {
            user.setCustomerStatus("Gold");
        }
        else
        if(i>=20)
        {
            user.setCustomerStatus("Platinum");
        }
        else
            user.setCustomerStatus("Regular");
        User userS = userRepo.save(user);
    }
    public User findUser(Long id)
    {
        return userRepo.findById(id).get();
    }

    public User createUser(User customer)

    {
        return userRepo.save(customer);
    }
}

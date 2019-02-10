package com.example.demo.service;

import com.example.demo.entities.User;
import com.example.demo.userepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class UserService
{

    private UserRepo userRepo;


    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    public void deleteAll() {
         userRepo.deleteAll();
    }

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
    public Iterable<User> findAl()
    {
        return userRepo.findAll();
    }
}

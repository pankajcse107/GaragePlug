package com.example.demo.service;

import com.example.demo.entities.Category;
import com.example.demo.entities.Order;
import com.example.demo.entities.User;
import com.example.demo.userepository.OrderRepository;
import com.example.demo.userepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class UserService
{

    private UserRepo userRepo;
    private final OrderRepository orderRepository;




    @Autowired
    public UserService(UserRepo userRepo, OrderRepository orderRepository) {
        this.userRepo = userRepo;
        this.orderRepository = orderRepository;
    }


    public void deleteAll() {
         userRepo.deleteAll();
    }

    public void updateCategory(User user)
    {

        int count = orderRepository.countByCustomerId(user.getId());

        if(count >=10&& count<20)
        {
            user.setCategory(Category.GOLD);

        }
        else
        if(count>=20)
        {
            user.setCategory(Category.PLATINUM);

        }
        else
            user.setCategory(Category.REGULAR);
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
    public Iterable<User> findAll()
    {
        return userRepo.findAll();
    }
}

package com.example.demo.service;

import com.example.demo.customer.User;
import com.example.demo.userepository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
     OrderRepository orderRepository;


     @Autowired
     public OrderService(OrderRepository orderRepository)
     {
        this.orderRepository = orderRepository;
     }


}

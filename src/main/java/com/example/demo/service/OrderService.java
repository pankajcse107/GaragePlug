package com.example.demo.service;

import com.example.demo.customer.Order;
import com.example.demo.userepository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderService {
     OrderRepository orderRepository;

     @Autowired
     public OrderService(OrderRepository orderRepository)
     {
        this.orderRepository = orderRepository;
     }

     public Order post(@RequestBody Order order)
     {
         return orderRepository.save(order);
     }

     public Iterable<Order> findAll() {
         return orderRepository.findAll();

     }

     public void deleteAll() {
          orderRepository.deleteAll();
     }
}

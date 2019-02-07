package com.example.demo.service;

import com.example.demo.customer.Order;
import com.example.demo.userepository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderService {
     OrderRepository orderRepository;

    /* @Autowired
     public OrderService(OrderRepository orderRepository)
     {
        this.orderRepository = orderRepository;
     }

     public Order post(@RequestBody Order order)
     {
          //apply discount based on customer status/category
          return orderRepository.save(order);
     }

     public Iterable<Order> findAll() {
         return orderRepository.findAll();

     }

     public void deleteAll()
     {
          orderRepository.deleteAll();
     }

     @Async
     public void updateCustomerStatus(Long customerId)
     {
          Long count = orderRepository.getCountByCustomerId(customerId);
          if(count>=10 && count <20)
          {
               System.out.println("you are a gold customer!! If you want to become a gold customer");

          } else if(count>=20 && count< 30)
          {
               System.out.println("You are a platinum custome");

          }
          else
          {
               System.out.println("you are regular");
          }
     }*/
}

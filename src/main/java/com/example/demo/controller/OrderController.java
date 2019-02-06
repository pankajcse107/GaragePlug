package com.example.demo.controller;

import com.example.demo.customer.OrderPlaced;
import com.example.demo.userepository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    OrderRepository orderRepository;

            @Autowired
        public OrderController(OrderRepository orderRepository)
            {
                this.orderRepository = orderRepository;
            }

            @PostMapping
         public OrderPlaced placed(@RequestBody OrderPlaced order)
            {
              return orderRepository.save(order);
            }

            @RequestMapping(method = RequestMethod.GET)
    public Iterable<OrderPlaced> postAll()
            {
               return orderRepository.findAll();
            }

            @DeleteMapping("/delete")
           public void deleteAll()
            {
                orderRepository.deleteAll();
            }

}

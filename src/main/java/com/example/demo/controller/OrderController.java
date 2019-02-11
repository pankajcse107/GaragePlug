package com.example.demo.controller;

import com.example.demo.entities.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void create(@RequestBody Order order) {
        orderService.createOrder(order);

    }

           /* @RequestMapping(method = RequestMethod.GET)
            public Iterable<Order> postAll()
            {
               return orderRepository.findAll();
            }

            @DeleteMapping("/delete")
           public void deleteAll()

            {
                orderRepository.deleteAll();
            }*/

}

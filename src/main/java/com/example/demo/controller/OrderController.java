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
    @GetMapping
    public Iterable<Order> getOrder()

    {
       return orderService.getOrder();
    }

    @PutMapping()
    public void updateOrder(@RequestBody Order order,@RequestParam Long orderId)
    {
        orderService.updateOrder(order,orderId);
    }

}

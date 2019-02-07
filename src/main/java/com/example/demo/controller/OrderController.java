package com.example.demo.controller;

import com.example.demo.customer.Order;
import com.example.demo.service.OrderService;
import com.example.demo.userepository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;
    private UserController userController;

            @Autowired
        public OrderController(OrderService orderService)


            {
                this.orderService = orderService;
            }

            @PostMapping
         public Order placed(@RequestBody Order order)


            {
                int count = 0;
                count++;
              return orderService.post(order);
            }

            @RequestMapping(method = RequestMethod.GET)
    public Iterable<Order> postAll()

            {
               return orderService.findAll();
            }

            @DeleteMapping("/delete")
           public void deleteAll()


            {
                orderService.deleteAll();
            }


}

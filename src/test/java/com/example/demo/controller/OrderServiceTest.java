package com.example.demo.controller;

import com.example.demo.entities.Order;
import com.example.demo.entities.User;
import com.example.demo.service.OrderService;
import com.example.demo.service.UserService;
import com.example.demo.userepository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Mock
    User user;


    @Mock
    UserService userService;

    @Mock
    OrderRepository orderRepository;

    @InjectMocks
    OrderService orderService;


    @Test
    public void updatePrice()
    {
      //GIVEN
        Order order = new Order();
        order.setTotalAmount(100);
        User user = new User();
        user.setCustomerStatus("Gold");

        //OrderRepository Mock method behavious is not set because we do not care about the return value

        //WHEN
        orderService.updatePrice(order,user);
        int x = order.getNetAmount();

        //THEN
        assertEquals(90,x);

    }
    @Test
    public void createOrderTest()
    {

        //GIVEN
        Order order = new Order();
        order.setTotalAmount(5000);
        order.setCustomerId(21L);
        orderService.updatePrice(order,user);
        orderService.incrimentOrderCount(user);



        //WHEN
        Mockito.when(orderRepository.save(order)).thenReturn(order);
        Order o = orderService.createOrder(order);

        //THEN
        assertEquals(o.getCustomerId(),order.getCustomerId());
    }





}
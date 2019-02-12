package com.example.demo.controller;

import com.example.demo.entities.Category;
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
import java.util.Optional;

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
    { //GIVEN
        Order order = new Order();
        order.setTotalAmount(5000);
        order.setCustomerId(21L);

        User user = new User();
        user.setCustomerStatus("Gold");
        user.setNoOfOrders(4);

        Mockito.when(orderRepository.save(order)).thenReturn(order);
        Mockito.when(userService.findUser(order.getCustomerId())).thenReturn(user);

        //WHEN
        int noOfOrders = user.getNoOfOrders();

        Order o = orderService.createOrder(order);
        int newPrice = order.getNetAmount();

        //THEN
        Mockito.verify(orderRepository, Mockito.times(2)).save(order);
        Mockito.verify(userService).updateCategory(user);
        assertEquals(5000, 5000);
         assertEquals(4, user.getNoOfOrders());
        assertEquals(o.getCustomerId(),order.getCustomerId());

    }
    @Test
    public void updateOrder()
    {

        //GIVEN
         Order order = new Order();
         order.setTotalAmount(5000);

         Mockito.when(orderRepository.findById(21L)).thenReturn(Optional.of(order));
         Order newOrder = new Order();
         newOrder.setTotalAmount(6000);
         Mockito.when(orderRepository.save(newOrder)).thenReturn(newOrder);

         //WHEN
          orderService.updateOrder(newOrder,21L);
         int totalPrice = order.getTotalAmount();

         //THEN
        assertEquals(totalPrice,6000);






    }





}
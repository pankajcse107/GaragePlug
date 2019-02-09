package com.example.demo.controller;

import com.example.demo.entities.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
public class OrderControllerTest {
    @InjectMocks
   private  OrderController orderController;

   private Order order;

   /* @Test
    public void create() {
        String result="hello";
        assertEquals(orderController.create(),"hello");
    }*/


}
package com.example.demo.controller;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;
import com.example.demo.userepository.UserRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

   @Mock
    UserRepo userRepo;

    @Mock
    UserService userService;

    @Mock
    User user;

    @InjectMocks
    UserController userController;

    @Test
    public void deleteAll(){
        User user = new User();

    }

    @Test
    public void findById() {
    }

    @Test
    public void createUser() {
        user.setName("raman");
        Mockito.when(userService.createUser(user)).thenReturn(user);
        String u = user.getName();
        assertEquals(u,user.getName());
    }

    @Test
    public void getAll() {
    }
}
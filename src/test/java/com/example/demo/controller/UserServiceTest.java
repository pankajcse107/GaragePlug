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
public class UserServiceTest {




   @Mock
    UserRepo userRepo;

    @InjectMocks
    UserService userService;

    @Test
    public void deleteAll()
    {
        //WHEN
        userService.deleteAll();

        //THEN
        Mockito.verify(userRepo).deleteAll();
    }

    @Test
    public void findById() {
    }

    @Test
    public void createUser() {
        //GIVEN
        User user = new User();
       user.setName("raman");

       //WHEN
        Mockito.when(userRepo.save(user)).thenReturn(user);
        User u = userService.createUser(user);

        //THEN
        assertEquals(u , user);
    }


}
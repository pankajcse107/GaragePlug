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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {



  @Mock
  User user;

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
    @Test
    public void findUserById()
    {
        //GIVEN
        User user = new User();
        user.setName("pankaj");

        //WHEN
        Mockito.when(userRepo.findById(10l)).thenReturn(Optional.of(user));
        User u = userService.findUser(10l);

        //THEN
        assertEquals(u,user);

    }
    @Test
    public void findAll()
    {
        List<User> users = new ArrayList<>();
        //GIVEN
        User user = new User();


        users.add(user);
        Mockito.when(userRepo.findAll()).thenReturn(users);

        //WHEN
        Iterable<User> u = userService.findAll();

        //THEN
        assertEquals(u,users);
    }
    @Test
    public void updateUserTest()
    {
        //GIVEN
        //Whatever is there in the updateUser method as input parameter has to be given in given clause
        User user = new User();
         user.setEmail("pankaj");
        Mockito.when(userRepo.findById(10L)).thenReturn(Optional.of(user));


        //WHEN
        //Here we have created an new object  of User class as UpdateUser to test if the email is getting updated or not
        User updatedUser = new User();
        updatedUser.setEmail("abc");
        Mockito.when(userRepo.save(user)).thenReturn(updatedUser);

        User user2 = userService.createUser(user);


        //THEN
        assertEquals(updatedUser.getEmail(),user2.getEmail());







    }


}
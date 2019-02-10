package com.example.demo.controller;

import com.example.demo.entities.Item;
import com.example.demo.entities.User;
import com.example.demo.service.ItemService;
import com.example.demo.userepository.ItemRepository;
import junit.runner.Version;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;


public class ItemControllerTest {




    @Mock
    ItemService itemService;

    @Mock
    ItemRepository itemRepository;

    @InjectMocks
    ItemController itemController;


    @Test
    public void itemGetById() {
        Item item = new Item();

        item.setItemName("raju");
            Mockito.when(itemController.getById(10L)).thenReturn(item);
            Item i = itemController.getById(10L);
            assertEquals(i.getItemName(), item.getItemName());
        }



    }

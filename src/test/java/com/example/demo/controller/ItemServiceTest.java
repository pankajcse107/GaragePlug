package com.example.demo.controller;

import com.example.demo.entities.Item;
import com.example.demo.entities.User;
import com.example.demo.service.ItemService;
import com.example.demo.userepository.ItemRepository;
import junit.runner.Version;
import org.junit.Assert;
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
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ItemServiceTest {



    @Mock
    Item item;

    @InjectMocks
    ItemService itemService;

    @Mock
    ItemRepository itemRepository;



    @Test
    public void itemGetById() {
       //Given
        item.setItemName("raju");
        Mockito.when(itemRepository.findById(10L)).thenReturn(Optional.of(item));

           //WHEN

            Item i = itemService.getItem(10L);

            //THEN
            assertEquals(i.getItemName(), item.getItemName());
            Mockito.verify(itemRepository).findById(10L);
        }

       @Test
    public void deleteAll()
       {
           //WHEN
            itemService.deleteAll();

           //THEN
           Mockito.verify(itemRepository).deleteAll();

       }
       @Test
    public void postTest() {
           //GIVEN
           Item item = new Item();
           item.setItemName("Deodrant");

           //WHEN
           Mockito.when(itemRepository.save(item)).thenReturn(item);
           Item i = itemService.post(item);


           //THEN
           assertEquals(i,item);
       }

       @Test
    public  void  getAll()
       {

           //GIVEN
           List<Item> items = new ArrayList<>();
           items.add(item);
           Mockito.when(itemRepository.findAll()).thenReturn(items);

           //WHEN
           Iterable<Item> i = itemService.get();

           //THEN
           assertEquals(i,items);


       }



    }

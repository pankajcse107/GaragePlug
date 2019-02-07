package com.example.demo.controller;

import com.example.demo.customer.Item;
import com.example.demo.service.ItemService;
import com.example.demo.userepository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
public class ItemController {


   private ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService)


    {
        this.itemService = itemService;
    }

    @PostMapping
    public Item post(@RequestBody Item item)

    {
         return itemService.post(item);
    }

    @GetMapping
    public Iterable<Item> getAll()
    {
        return itemService.get();
    }
    @DeleteMapping("/delete")
    public void deleteAll()

    {
        itemService.deleteAll();
    }

}

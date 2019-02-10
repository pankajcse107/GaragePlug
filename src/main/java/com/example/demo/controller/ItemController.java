package com.example.demo.controller;

import com.example.demo.entities.Item;
import com.example.demo.entities.User;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
public class ItemController {


    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/post")
    public Item post(@RequestBody Item item) {
        return itemService.post(item);
    }

    @GetMapping
    public Iterable<Item> getAll() {
        return itemService.get();
    }

    @GetMapping("/get")
    public Item getById(@RequestParam Long id)
    {
        return itemService.getItem(id);
    }

    @DeleteMapping("/delete")
    public void deleteAll() {
        itemService.deleteAll();
    }

}

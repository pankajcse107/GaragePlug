package com.example.demo.controller;

import com.example.demo.customer.Item;
import com.example.demo.userepository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
public class ItemController {

   private ItemRepository itemRepository;
    @Autowired
    public ItemController(ItemRepository itemRepository)

    {
        this.itemRepository = itemRepository;
    }

    @PostMapping
    public Item post(@RequestBody Item item)
    {
         return itemRepository.save(item);
    }

    @GetMapping
    public Iterable<Item> getAll()
    {
        return itemRepository.findAll();
    }
    @DeleteMapping("/delete")
    public void deleteAll()
    {
        itemRepository.deleteAll();
    }

}

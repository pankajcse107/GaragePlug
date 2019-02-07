package com.example.demo.service;

import com.example.demo.customer.Item;
import com.example.demo.customer.User;
import com.example.demo.userepository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ItemService {
    ItemRepository itemRepository;
    @Autowired
    public ItemService(ItemRepository itemRepository) {

        this.itemRepository = itemRepository;
    }
    public Item post(@RequestBody Item item)
    {
        return itemRepository.save(item);
    }
    public Iterable<Item> get()
    {
        return itemRepository.findAll();
    }
    public void deleteAll()
    {
        itemRepository.deleteAll();
    }

}

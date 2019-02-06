package com.example.demo.service;

import com.example.demo.userepository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    ItemRepository itemRepository;
    @Autowired
    public ItemService(ItemRepository itemRepository) {

        this.itemRepository = itemRepository;
    }
    public void deleteAll()
    {
        itemRepository.deleteAll();
    }
}

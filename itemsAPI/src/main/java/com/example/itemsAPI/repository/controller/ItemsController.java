package com.example.itemsAPI.repository.controller;

import com.example.itemsAPI.repository.ItemsRepository;
import com.example.itemsAPI.repository.entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController{

    final ItemsRepository itemsRepository;


    public ItemsController(@Autowired ItemsRepository itemsRepository )
    {
        this.itemsRepository = itemsRepository;
    }

    @GetMapping
    public List<Items> getItems(){
        return itemsRepository.findAll();
    }


}
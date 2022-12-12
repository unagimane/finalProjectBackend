package com.example.itemsAPI.service;

import com.example.itemsAPI.repository.ItemsRepository;
import com.example.itemsAPI.repository.entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService
{
    private final ItemsRepository itemsRepository;

    public ItemsServiceMySQL(@Autowired ItemsRepository itemRepository )
    {
        this.itemsRepository = itemRepository;
    }


    public Items save( Items items )
    {
        //TODO implement this method
        return null;
    }


    public void delete( int itemsId )
    {
        //TODO implement this method
    }


    public List<Items> all()
    {
        //TODO implement this method
        return null;
    }


    public Items findById( int itemId )
    {
        //TODO implement this method
        return null;
    }
}


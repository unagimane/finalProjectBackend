package com.example.itemsAPI.service;

import com.example.itemsAPI.repository.ItemsRepository;
import com.example.itemsAPI.repository.entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemsService
{
    private final ItemsRepository itemsRepository;


    public ItemsService(@Autowired ItemsRepository itemsRepository )

    {
        this.itemsRepository = itemsRepository;
    }


    public Items save(Items items )
    {
        //TODO implement this method
        return itemsRepository.save(items);
    }


    public void delete( int itemsId )
    {
        //TODO implement this method

        itemsRepository.deleteById(itemsId);

    }


    public List<Items> all()
    {
        //TODO implement this method
        return itemsRepository.findAll();
    }



    public Items findById(int itemsId )
    {
        //TODO implement this method
        Optional<Items> item = itemsRepository.findById(itemsId);
        boolean isPresent = item.isPresent();
        if (isPresent) {
            return item.get();
        } else {
            return null;
        }


    }
}


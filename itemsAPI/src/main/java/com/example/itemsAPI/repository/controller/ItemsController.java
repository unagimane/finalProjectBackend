package com.example.itemsAPI.repository.controller;

import com.example.itemsAPI.repository.ItemsRepository;
import com.example.itemsAPI.repository.entity.Items;
import com.example.itemsAPI.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.itemsAPI.repository.controller.dto.ItemDto;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemsController{
    private final ItemsService itemsService;



    public ItemsController(ItemsService itemsService){
        this.itemsService = itemsService;

    }

    @GetMapping("/all")
    public List<Items> getItems(){
        return itemsService.all();
    }

    @CrossOrigin
    @PostMapping
    public Items save( @RequestBody ItemDto itemDto )
    {
        return itemsService.save( new Items( itemDto ) );
    }

    @GetMapping("/{id}")
    public Items findItemById( @PathVariable Integer id ){
        return itemsService.findById( id );
    }


    @PutMapping( "/{id}" )
    public Items update( @RequestBody ItemDto itemDto, @PathVariable Integer id )
    {
        Items item = itemsService.findById(id);
        item.setName( itemDto.getName() );
        item.setDescription( itemDto.getDescription() );
        item.setImageUrl( itemDto.getImageUrl() );
        return itemsService.save(item);
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        itemsService.delete( id );
    }


}
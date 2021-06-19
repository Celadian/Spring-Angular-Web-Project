package com.dtrband.dtrbackend01.controllers;

import com.dtrband.dtrbackend01.models.Item;
import com.dtrband.dtrbackend01.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @GetMapping
    public List<Item> getAll(){
        return itemService.getAll();
    }

    @PutMapping
    public void updateById(@RequestBody Item item){
        itemService.updateById(item);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Integer id){
        itemService.deleteById(id);
    }
}

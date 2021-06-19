package com.dtrband.dtrbackend01.services;

import com.dtrband.dtrbackend01.models.About;
import com.dtrband.dtrbackend01.models.Item;
import com.dtrband.dtrbackend01.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public void addItem(Item item) {
        itemRepository.save(item);
    }

    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    public void updateById(Item item) {
        Item oldItem = itemRepository.findById(item.getId()).get();
        if(item.getDescription() != null)oldItem.setDescription(item.getDescription());
        if(item.getTitle() != null)oldItem.setTitle(item.getTitle());
        if(item.getPrice() != 0)oldItem.setPrice(item.getPrice());
        itemRepository.save(oldItem);
    }

    public void deleteById(Integer id) {
        itemRepository.deleteById(id);
    }
}

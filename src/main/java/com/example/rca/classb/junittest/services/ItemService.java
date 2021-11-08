package com.example.rca.classb.junittest.services;

import com.example.rca.classb.junittest.models.Item;
import com.example.rca.classb.junittest.repositories.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private IItemRepository itemRepository;

    public List<Item> getAll() {
        List<Item> items = this.itemRepository.findAll();
        for(Item item:items) {
            item.setValue(item.getQuantity()*item.getPrice());
        }

        return items;
    }
}

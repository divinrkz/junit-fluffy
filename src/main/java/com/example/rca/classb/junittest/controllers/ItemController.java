package com.example.rca.classb.junittest.controllers;

import com.example.rca.classb.junittest.models.Item;
import com.example.rca.classb.junittest.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping(path = "api/v1/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/all-items")
    public List<Item> getAll(){
        return itemService.getAll();
    }
}

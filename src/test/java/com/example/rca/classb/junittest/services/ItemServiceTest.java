package com.example.rca.classb.junittest.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.rca.classb.junittest.models.Item;
import com.example.rca.classb.junittest.repositories.IItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class ItemServiceTest {
    @Mock
    private IItemRepository itemRepository;

    @InjectMocks
    private ItemService itemService;

    @Test
    public void getAll_withSomeElements() {
        when(itemRepository.findAll()).thenReturn(Arrays.asList(new Item(1,"Sdsamuel",1,10),
                new Item(2,"Blessing",4,100)));

        assertEquals(10,itemService.getAll().get(0).getValue());

    }
}

package com.example.rca.classb.junittest.repositories;

import com.example.rca.classb.junittest.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemRepository extends JpaRepository<Item, Integer> {
}

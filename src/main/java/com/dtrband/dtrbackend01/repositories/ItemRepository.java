package com.dtrband.dtrbackend01.repositories;

import com.dtrband.dtrbackend01.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}

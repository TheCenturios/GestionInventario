package com.codingdojo.centurion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.centurion.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByType(String type);
    
    List<Item> findByPriorityRateLessThanEqual(Integer priorityRate);
}


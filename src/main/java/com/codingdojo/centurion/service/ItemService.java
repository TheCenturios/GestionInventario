package com.codingdojo.centurion.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.centurion.dto.ItemDTO;
import com.codingdojo.centurion.model.Item;
import com.codingdojo.centurion.repository.ItemRepository;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

 // ... other methods in ItemService

    public ItemDTO createItem(ItemDTO itemDTO) {
        // Convert ItemDTO to Item entity
        Item item = new Item();
        item.setName(itemDTO.getName());
        item.setType(itemDTO.getType());
        item.setQuantity(itemDTO.getQuantity());
        item.setPriorityRate(itemDTO.getPriorityRate());
        Item savedItem = itemRepository.save(item);
        return convertToDTO(savedItem);
    }

    // ... rest of the ItemService


    public List<ItemDTO> getAllItems() {
        return itemRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Add methods for update, delete, and any other business operations...
    
    private ItemDTO convertToDTO(Item item) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setName(item.getName());
        itemDTO.setType(item.getType());
        itemDTO.setQuantity(item.getQuantity());
        itemDTO.setPriorityRate(item.getPriorityRate());
        return itemDTO;
    }
    
 // ... other methods in ItemService

    public ItemDTO updateItem(Long id, ItemDTO itemDTO) {
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found")); // Custom exception recommended
        item.setName(itemDTO.getName());
        item.setType(itemDTO.getType());
        item.setQuantity(itemDTO.getQuantity());
        item.setPriorityRate(itemDTO.getPriorityRate());
        Item updatedItem = itemRepository.save(item);
        return convertToDTO(updatedItem);
    }

    public void deleteItem(Long id) {
        if (!itemRepository.existsById(id)) {
            throw new RuntimeException("Item not found"); // Custom exception recommended
        }
        itemRepository.deleteById(id);
    }

}


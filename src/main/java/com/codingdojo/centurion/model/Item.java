package com.codingdojo.centurion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type; // Could also be an Enum depending on your specific types

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Integer priorityRate; // Assuming lower numbers are higher priority

    // Constructors, getters, and setters
    public Item() {}

    public Item(String name, String type, Integer quantity, Integer priorityRate) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.priorityRate = priorityRate;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Integer getPriorityRate() { return priorityRate; }
    public void setPriorityRate(Integer priorityRate) { this.priorityRate = priorityRate; }

    // Override equals, hashCode and toString methods as needed
}


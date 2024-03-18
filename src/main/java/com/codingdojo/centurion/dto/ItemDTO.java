package com.codingdojo.centurion.dto;

public class ItemDTO {

    private String name;
    private String type;
    private Integer quantity;
    private Integer priorityRate;

    // Constructors, getters, and setters
    public ItemDTO() {}

    public ItemDTO(String name, String type, Integer quantity, Integer priorityRate) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.priorityRate = priorityRate;
    }

    // Getters and setters
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


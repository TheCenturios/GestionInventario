package com.codingdojo.centurion.dto;

public class WorkerDto {
    private String name;
    private String lastName;
    private String rut; // Consider if you need all attributes for the DTO

    // Standard getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    // Constructor
    public WorkerDto() {
    }

    public WorkerDto(String name, String lastName, String rut) {
        this.name = name;
        this.lastName = lastName;
        this.rut = rut;
    }

    // Implement toString, equals, and hashCode methods if needed
}

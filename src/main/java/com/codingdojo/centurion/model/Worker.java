package com.codingdojo.centurion.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String rut; // Unique Identifier

    // Standard constructors, getters, and setters
    public Worker() { }

    public Worker(String name, String lastName, String rut) {
        this.name = name;
        this.lastName = lastName;
        this.rut = rut;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public String getRut() { return rut; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setRut(String rut) { this.rut = rut; }
}
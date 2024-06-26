package com.example.petstore.petstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Double price;
    private String name;
    private String breed;
    private String status;
    private String code;
    private String description;
    private String imageUrl;
    private String videoUrl;
    private String age;
    private String temperament;

    // Getters and setters
    // ...

}

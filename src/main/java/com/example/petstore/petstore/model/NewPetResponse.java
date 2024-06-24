package com.example.petstore.petstore.model;

import lombok.Data;

@Data
public class NewPetResponse {


    private Pet pet;
    private String message;
    private String status;

    // Getters and setters
    // ...

}

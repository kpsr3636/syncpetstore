package com.example.petstore.petstore.model;

import lombok.Data;

@Data
public class NewPetResponse {


    private Pet pet;
    private String message;
    private String status;
    private String code;
    private String type;
    private String name;

    // Getters and setters
    // ...

}

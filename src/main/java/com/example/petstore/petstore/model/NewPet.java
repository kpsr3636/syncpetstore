package com.example.petstore.petstore.model;

import lombok.Data;

@Data
public class NewPet {
    private String type;
    private Double price;
    private String name;
    private String breed;
    private String status;
    private String code;


}

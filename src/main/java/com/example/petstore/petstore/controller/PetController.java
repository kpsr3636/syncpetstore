package com.example.petstore.petstore.controller;


import com.example.petstore.petstore.model.NewPet;
import com.example.petstore.petstore.model.NewPetResponse;
import com.example.petstore.petstore.model.Pet;
import com.example.petstore.petstore.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> getAllPets(@RequestParam(required = false) String type,
                                @RequestParam(required = false) String page) {
        return petService.getAllPets(type, page);
    }

    @GetMapping("/{petId}")
    public Pet getPetById(@PathVariable Long petId) {
        return petService.getPetById(petId);
    }

    @PostMapping
    public NewPetResponse createPet(@RequestBody NewPet newPet) {
        return petService.createPet(newPet);
    }

    @PutMapping("/{petId}")
    public Pet updatePet(@PathVariable Long petId, @RequestBody NewPet newPet) {
        return petService.updatePet(petId, newPet);
    }

    @DeleteMapping("/{petId}")
    public void deletePet(@PathVariable Long petId) {
        petService.deletePet(petId);
    }

}

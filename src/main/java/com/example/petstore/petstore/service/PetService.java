package com.example.petstore.petstore.service;

import com.example.petstore.petstore.model.NewPet;
import com.example.petstore.petstore.model.NewPetResponse;
import com.example.petstore.petstore.model.Pet;
import com.example.petstore.petstore.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List<Pet> getAllPets(String type, String page) {
        // Implement filtering and pagination logic
        return petRepository.findAll();
    }

    public Pet getPetById(Long petId) {
        return petRepository.findById(petId).orElse(null);
    }

    public NewPetResponse createPet(NewPet newPet) {
        Pet pet = new Pet();
        pet.setType(newPet.getType());
        pet.setPrice(newPet.getPrice());
        Pet savedPet = petRepository.save(pet);
        NewPetResponse response = new NewPetResponse();
        response.setPet(savedPet);
        response.setMessage("Pet created successfully");
        return response;
    }

}

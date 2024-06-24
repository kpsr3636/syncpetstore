package com.example.petstore.petstore.repository;

import com.example.petstore.petstore.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {

}

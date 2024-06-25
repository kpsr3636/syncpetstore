package com.example.petstore.petstore.repository;

import com.example.petstore.petstore.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findByType(String type);
}

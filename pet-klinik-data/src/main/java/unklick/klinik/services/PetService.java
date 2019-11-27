package unklick.klinik.services;

import unklick.klinik.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}

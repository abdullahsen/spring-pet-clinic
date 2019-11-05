package com.iafnstudios.petclinic.service.springdatajpa;


import com.iafnstudios.petclinic.model.Pet;
import com.iafnstudios.petclinic.repository.PetRepository;
import com.iafnstudios.petclinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetServiceSpringDataJpaServiceImpl implements PetService {

    private final PetRepository petRepository;

    public PetServiceSpringDataJpaServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();

        petRepository.findAll().iterator().forEachRemaining(pets::add);

        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}

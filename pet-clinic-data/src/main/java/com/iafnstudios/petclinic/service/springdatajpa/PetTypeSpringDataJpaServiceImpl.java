package com.iafnstudios.petclinic.service.springdatajpa;

import com.iafnstudios.petclinic.model.PetType;
import com.iafnstudios.petclinic.repository.PetTypeRepository;
import com.iafnstudios.petclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSpringDataJpaServiceImpl implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSpringDataJpaServiceImpl(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().iterator().forEachRemaining(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}

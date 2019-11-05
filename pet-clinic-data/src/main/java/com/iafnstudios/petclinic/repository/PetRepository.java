package com.iafnstudios.petclinic.repository;

import com.iafnstudios.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}

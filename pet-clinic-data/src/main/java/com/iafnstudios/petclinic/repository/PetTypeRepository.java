package com.iafnstudios.petclinic.repository;

import com.iafnstudios.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}

package com.iafnstudios.petclinic.repository;

import com.iafnstudios.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}

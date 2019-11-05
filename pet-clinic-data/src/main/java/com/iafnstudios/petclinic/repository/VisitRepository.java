package com.iafnstudios.petclinic.repository;

import com.iafnstudios.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}

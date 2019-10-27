package com.iafnstudios.petclinic.service;

import com.iafnstudios.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}

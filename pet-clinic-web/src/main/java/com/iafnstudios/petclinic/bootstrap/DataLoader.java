package com.iafnstudios.petclinic.bootstrap;

import com.iafnstudios.petclinic.model.Owner;
import com.iafnstudios.petclinic.model.Pet;
import com.iafnstudios.petclinic.model.Vet;
import com.iafnstudios.petclinic.service.OwnerService;
import com.iafnstudios.petclinic.service.PetService;
import com.iafnstudios.petclinic.service.VetService;
import com.iafnstudios.petclinic.service.map.OwnerServiceMap;
import com.iafnstudios.petclinic.service.map.PetServiceMap;
import com.iafnstudios.petclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        petService = new PetServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);



        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");


        vetService.save(vet2);

    }
}

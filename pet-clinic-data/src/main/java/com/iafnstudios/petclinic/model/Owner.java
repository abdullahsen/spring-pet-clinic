package com.iafnstudios.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "owners")
@Getter
@Setter
@NoArgsConstructor
public class Owner extends Person {

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String telephone, String city, Set<Pet> pets) {
        super(id,firstName, lastName);
        this.address = address;
        this.telephone = telephone;
        this.city = city;
        this.pets = pets;
    }

    @Column(name = "address")
    private String address;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "city")
    private String city;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

}

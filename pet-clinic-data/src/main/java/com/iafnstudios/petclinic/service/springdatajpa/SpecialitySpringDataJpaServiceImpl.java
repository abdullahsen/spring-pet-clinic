package com.iafnstudios.petclinic.service.springdatajpa;


import com.iafnstudios.petclinic.model.Speciality;
import com.iafnstudios.petclinic.repository.SpecialityRepository;
import com.iafnstudios.petclinic.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySpringDataJpaServiceImpl implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySpringDataJpaServiceImpl(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }


    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();

        specialityRepository.findAll().iterator().forEachRemaining(specialities::add);

        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}

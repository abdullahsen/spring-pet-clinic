package com.iafnstudios.petclinic.service.springdatajpa;

import com.iafnstudios.petclinic.model.Visit;
import com.iafnstudios.petclinic.repository.VisitRepository;
import com.iafnstudios.petclinic.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
@Profile("springdatajpa")
public class VisitSpringDataJpaServiceImpl implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSpringDataJpaServiceImpl(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }


    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();

        visitRepository.findAll().iterator().forEachRemaining(visits::add);

        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}

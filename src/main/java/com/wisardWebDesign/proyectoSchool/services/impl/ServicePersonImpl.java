package com.wisardWebDesign.proyectoSchool.services.impl;
import com.wisardWebDesign.proyectoSchool.models.Person;
import com.wisardWebDesign.proyectoSchool.repositories.RepositoryPerson;
import com.wisardWebDesign.proyectoSchool.services.ServicePerson;
import org.springframework.stereotype.Service;

@Service
public class ServicePersonImpl implements ServicePerson {
    private final RepositoryPerson repositoryPerson;
    public ServicePersonImpl(RepositoryPerson repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }
    @Override
    public Person findByEmail(String email) {
        return this.repositoryPerson.findByEmail(email);
    }
    @Override
    public void save(Person person){ this.repositoryPerson.save(person); }
}

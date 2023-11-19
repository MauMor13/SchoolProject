package com.wisardWebDesign.proyectoSchool.services.impl;
import com.wisardWebDesign.proyectoSchool.models.Specialty;
import com.wisardWebDesign.proyectoSchool.repositories.RepositorySpecialty;
import com.wisardWebDesign.proyectoSchool.services.ServiceSpecialty;
import org.springframework.stereotype.Service;

@Service
public class ServiceSpecialtyImpl implements ServiceSpecialty {
    private final RepositorySpecialty repositorySpecialty;
    public ServiceSpecialtyImpl(RepositorySpecialty repositorySpecialty) {this.repositorySpecialty = repositorySpecialty;}
    @Override
    public void save(Specialty specialty){ this.repositorySpecialty.save(specialty); }

}

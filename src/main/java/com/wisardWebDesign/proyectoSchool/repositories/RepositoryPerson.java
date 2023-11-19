package com.wisardWebDesign.proyectoSchool.repositories;
import com.wisardWebDesign.proyectoSchool.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositoryPerson extends JpaRepository <Person, Long> {
    Person findByEmail(String email);
}

package com.wisardWebDesign.proyectoSchool.services;
import com.wisardWebDesign.proyectoSchool.models.Person;

public interface ServicePerson {
    Person findByEmail(String email);
    void save(Person person);
}

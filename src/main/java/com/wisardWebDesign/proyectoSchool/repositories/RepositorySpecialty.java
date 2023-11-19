package com.wisardWebDesign.proyectoSchool.repositories;
import com.wisardWebDesign.proyectoSchool.models.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositorySpecialty extends JpaRepository<Specialty, Long> {
}

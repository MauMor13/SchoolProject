package com.wisardWebDesign.proyectoSchool.repositories;
import com.wisardWebDesign.proyectoSchool.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositoryTeacher extends JpaRepository <Teacher, Long> {

}

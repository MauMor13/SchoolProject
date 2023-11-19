package com.wisardWebDesign.proyectoSchool.repositories;
import com.wisardWebDesign.proyectoSchool.models.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositoryStudentCourse extends JpaRepository <StudentCourse,Long> {
}

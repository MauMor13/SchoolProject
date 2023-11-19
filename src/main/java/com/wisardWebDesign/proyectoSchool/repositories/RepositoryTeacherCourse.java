package com.wisardWebDesign.proyectoSchool.repositories;
import com.wisardWebDesign.proyectoSchool.models.TeacherCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositoryTeacherCourse extends JpaRepository <TeacherCourse,Long> {

}

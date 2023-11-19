package com.wisardWebDesign.proyectoSchool.services.impl;
import com.wisardWebDesign.proyectoSchool.repositories.RepositoryTeacherCourse;
import com.wisardWebDesign.proyectoSchool.services.ServiceTeacherCourse;
import org.springframework.stereotype.Service;

@Service
public class ServiceTeacherCourseImpl implements ServiceTeacherCourse {
    private final RepositoryTeacherCourse repositoryTeacherCourse;
    public ServiceTeacherCourseImpl(RepositoryTeacherCourse repositoryTeacherCourse) {this.repositoryTeacherCourse = repositoryTeacherCourse;}


}

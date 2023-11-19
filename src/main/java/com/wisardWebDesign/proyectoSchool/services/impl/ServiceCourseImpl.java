package com.wisardWebDesign.proyectoSchool.services.impl;
import com.wisardWebDesign.proyectoSchool.models.Course;
import com.wisardWebDesign.proyectoSchool.repositories.RepositoryCourse;
import com.wisardWebDesign.proyectoSchool.services.ServiceCourse;
import org.springframework.stereotype.Service;

@Service
public class ServiceCourseImpl implements ServiceCourse {
    private final RepositoryCourse repositoryCourse;
    public ServiceCourseImpl(RepositoryCourse repositoryCourse) { this.repositoryCourse = repositoryCourse; }

    @Override
    public void save(Course course){ this.repositoryCourse.save(course); }
}

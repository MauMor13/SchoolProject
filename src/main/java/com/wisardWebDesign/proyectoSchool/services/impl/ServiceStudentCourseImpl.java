package com.wisardWebDesign.proyectoSchool.services.impl;
import com.wisardWebDesign.proyectoSchool.repositories.RepositoryStudentCourse;
import com.wisardWebDesign.proyectoSchool.services.ServiceStudentCourse;
import org.springframework.stereotype.Service;

@Service
public class ServiceStudentCourseImpl implements ServiceStudentCourse {
    private final RepositoryStudentCourse repositoryStudentCourse;
    public ServiceStudentCourseImpl(RepositoryStudentCourse repositoryStudentCourse) { this.repositoryStudentCourse = repositoryStudentCourse; }


}

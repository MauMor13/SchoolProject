package com.wisardWebDesign.proyectoSchool.controllers;
import com.wisardWebDesign.proyectoSchool.dtos.TeacherDTO;
import com.wisardWebDesign.proyectoSchool.repositories.RepositoryTeacher;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ControllerTeacher {
    private final RepositoryTeacher repositoryTeacher;
    private final PasswordEncoder passwordEncoder;
    public ControllerTeacher(RepositoryTeacher repositoryTeacher, PasswordEncoder passwordEncoder) {
        this.repositoryTeacher = repositoryTeacher;
        this.passwordEncoder = passwordEncoder;
    }
    @GetMapping("/teachers")
    public List<TeacherDTO> GetTeachersDTO (){
        return repositoryTeacher.findAll().stream().map(TeacherDTO::new).collect(Collectors.toList());
    }
}

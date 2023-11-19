package com.wisardWebDesign.proyectoSchool.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student extends Person{
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private Set<StudentCourse> studentCourses = new HashSet<>();
    public Student(String name, String lastName, String address, String email, byte age, LocalDate birth, String loginKey, int tel) {
        super(name, lastName, address, email, age, birth, loginKey, tel);
    }
    public void add(StudentCourse studentCourse){

    }
}

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
public class Teacher extends Person{
    private boolean isAdmin = false;
    @OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER)
    private Set<TeacherCourse> teacherCourses = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "teacher_specialty",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialties;
    public Teacher(String name, String lastName, String address, String email, byte age, LocalDate birth, String loginKey, int tel) {
        super(name, lastName, address, email, age, birth, loginKey, tel);
    }
}

package com.wisardWebDesign.proyectoSchool.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Duration duration;
    private boolean activeRegistration;
    private LocalDate initCourse;
    private Turn turnCourse;
    @ManyToMany
    @JoinTable(
            name = "course_specialty",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialties;
    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    private Set<StudentCourse> studentCourses = new HashSet<>();
    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    private Set<TeacherCourse> teacherCourses = new HashSet<>();
    public Course(String name, Duration duration, LocalDate initCourse, Turn turnCourse) {
        this.name = name;
        this.duration = duration;
        this.activeRegistration = initCourse.isBefore(LocalDate.now());
        this.initCourse = initCourse;
        this.turnCourse = turnCourse;
    }
}
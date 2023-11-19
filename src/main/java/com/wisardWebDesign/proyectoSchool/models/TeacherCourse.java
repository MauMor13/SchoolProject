package com.wisardWebDesign.proyectoSchool.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class TeacherCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private RolTeacher role;
    private LocalDate assignmentDate = LocalDate.now();
    private boolean isActiveAssign = true;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private Course course;

    public TeacherCourse(RolTeacher role) {
        this.role = role;
    }
}

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
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private EnrollmentStatus enrollmentStatus = EnrollmentStatus.ENROLLED;
    private ApprovedStatus approvedStatus = ApprovedStatus.IN_PROGRESS;
    private LocalDate enrollmentDate = LocalDate.now();
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private Course course;
    public StudentCourse(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
}

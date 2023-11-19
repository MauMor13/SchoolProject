package com.wisardWebDesign.proyectoSchool.dtos;
import com.wisardWebDesign.proyectoSchool.models.Course;
import com.wisardWebDesign.proyectoSchool.models.Turn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Set;

@Getter
@NoArgsConstructor
public class CourseDTO {
    private long id;
    private String name;
    private Duration duration;
    private boolean activeRegistration;
    private LocalDate initCourse;
    private Turn turnCourse;
    public CourseDTO(Course course) {
        this.id = course.getId();
        this.name = course.getName();
        this.duration = course.getDuration();
        this.activeRegistration = course.isActiveRegistration();
        this.initCourse = course.getInitCourse();
        this.turnCourse = course.getTurnCourse();
    }
}

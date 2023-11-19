package com.wisardWebDesign.proyectoSchool.dtos;
import com.wisardWebDesign.proyectoSchool.models.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StudentDTO extends PersonDTO{
    private long id;
    public StudentDTO (Student student){
        super(student);
        this.id = student.getId();
    }
}

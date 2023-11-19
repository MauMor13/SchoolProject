package com.wisardWebDesign.proyectoSchool.dtos;
import com.wisardWebDesign.proyectoSchool.models.Teacher;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Set;

@Getter
@NoArgsConstructor
public class TeacherDTO extends PersonDTO{
    private long id;
    private boolean isAdmin;
    public TeacherDTO(Teacher teacher) {
        super(teacher);
        this.id = teacher.getId();
        this.isAdmin = teacher.isAdmin();
    }
}

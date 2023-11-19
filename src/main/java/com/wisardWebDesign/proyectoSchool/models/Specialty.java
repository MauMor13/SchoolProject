package com.wisardWebDesign.proyectoSchool.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @ManyToMany(mappedBy = "specialties")
    private Set<Teacher> teachers;
    @ManyToMany(mappedBy = "specialties")
    private Set<Course> courses;
    public Specialty(String name, String description) {
        this.name = name;
        this.description = description;
    }
}

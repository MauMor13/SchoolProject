package com.wisardWebDesign.proyectoSchool.dtos;
import com.wisardWebDesign.proyectoSchool.models.Person;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class PersonDTO {
    private long id;
    private String name;
    private String lastName;
    private String address;
    private String email;
    private byte age;
    private LocalDate birth;
    private int tel;
    public PersonDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.lastName = person.getLastName();
        this.address = person.getAddress();
        this.email = person.getAddress();
        this.age = person.getAge();
        this.birth = person.getBirth();
        this.tel = person.getTel();
    }
}

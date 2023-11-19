package com.wisardWebDesign.proyectoSchool.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String lastName;
    private String address;
    private String email;
    private byte age;
    private LocalDate birth;
    private String loginKey;
    private int tel;

    public Person(String name, String lastName, String address, String email, byte age, LocalDate birth, String loginKey, int tel) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
        this.birth = birth;
        this.loginKey = loginKey;
        this.tel = tel;
    }
}

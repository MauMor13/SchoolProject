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
public class Admin extends Person{
    public Admin(String name, String lastName, String address, String email, byte age, LocalDate birth, String loginKey, int tel) {
        super(name, lastName, address, email, age, birth, loginKey, tel);
    }
}

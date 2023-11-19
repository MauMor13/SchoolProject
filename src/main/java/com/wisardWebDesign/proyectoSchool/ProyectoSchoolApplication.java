package com.wisardWebDesign.proyectoSchool;

import com.wisardWebDesign.proyectoSchool.models.*;
import com.wisardWebDesign.proyectoSchool.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.time.Duration;
import java.time.LocalDate;

@SpringBootApplication
public class ProyectoSchoolApplication {
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSchoolApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDataBase(ServicePerson servicePerson,
										  ServiceCourse serviceCourse,
										  ServiceTeacherCourse serviceTeacherCourse,
										  ServiceStudentCourse serviceStudentCourse,
										  ServiceSpecialty serviceSpecialty){
		return (args) -> {
			//creamos los distintos usuarios
			Admin admin = new Admin("Juan","Rodriguez","Villa la Lata","labrasajuanchi@gmail.com", (byte) 31,LocalDate.of(1992,10,15),passwordEncoder.encode("EllocoJuan15"),1564230);
			Teacher teacher = new Teacher("Pablo","Crespo","Villa Rumipal","pablito1998@gmail.com",(byte)23,LocalDate.of(2000,7,15), passwordEncoder.encode( "Pablito9813"),356413468);
			Student student = new Student("Pedro","Ayala","Cordoba","pedrogoloso@gmail.com",(byte)20,LocalDate.of(2003,4,3),"pedroTurrito12",15224568);
			Course course = new Course("Java Programming", Duration.ofHours(2000), LocalDate.of(2023,12,13), Turn.NIGHT);
			Specialty java = new Specialty("Java","Knowledge in developing with java");
			Specialty cpp = new Specialty("C++","Knowledge in developing with c++");
			Specialty javaScript = new Specialty("JavaScript","Knowledge in developing with javaScript");

			//guardo las entidades
			servicePerson.save(admin);
			servicePerson.save(teacher);
			servicePerson.save(student);
			serviceCourse.save(course);
			serviceSpecialty.save(java);
			serviceSpecialty.save(cpp);
			serviceSpecialty.save(javaScript);
		};
	}

}

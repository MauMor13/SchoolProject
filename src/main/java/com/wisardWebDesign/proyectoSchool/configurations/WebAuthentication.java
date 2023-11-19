package com.wisardWebDesign.proyectoSchool.configurations;
import com.wisardWebDesign.proyectoSchool.models.Admin;
import com.wisardWebDesign.proyectoSchool.models.Person;
import com.wisardWebDesign.proyectoSchool.models.Student;
import com.wisardWebDesign.proyectoSchool.models.Teacher;
import com.wisardWebDesign.proyectoSchool.services.ServicePerson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebAuthentication  extends GlobalAuthenticationConfigurerAdapter {
    private final ServicePerson servicePerson;
    public WebAuthentication(ServicePerson servicePerson) {
        this.servicePerson = servicePerson;
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(email -> {
            Person person = servicePerson.findByEmail(email);
            if (person instanceof Admin ){
                return new User(
                        person.getEmail(),
                        person.getLoginKey(),
                        AuthorityUtils.createAuthorityList("ADMIN"));
            } else if (person instanceof Teacher){
                if (((Teacher) person).isAdmin()){
                    return new User(
                        person.getEmail(),
                            person.getLoginKey(),
                            AuthorityUtils.createAuthorityList("ADMIN", "TEACHER"));
                } else{
                return new User(
                        person.getEmail(),
                        person.getLoginKey(),
                        AuthorityUtils.createAuthorityList("TEACHER"));
                }
            } else if (person instanceof Student) {
                return new User(
                        person.getEmail(),
                        person.getLoginKey(),
                        AuthorityUtils.createAuthorityList("STUDENT"));
            } else {
                throw new UsernameNotFoundException("Unknown user " +  email);
            }
        });
    }
}

package br.com.devdojo.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;

/**
 * Created by eduardomunareto on 13/09/21.
 */
@Entity
public class Student extends AbstractEntity {
    @NotEmpty(message = "O campo nome do estudante é obrigatório")
    private String name;
    @NotEmpty
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



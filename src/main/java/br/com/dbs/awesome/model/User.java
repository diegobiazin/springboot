package br.com.dbs.awesome.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
public class User extends AbstractEntity{
    @NotEmpty
    @Column(unique = true)
    private String username;
    @NotEmpty
    @JsonIgnore
    private String password;
    @NotEmpty
    private String nome;
    @NotEmpty
    private boolean adm;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdmin() {
        return adm;
    }

    public void setAdmin(boolean admin) {
        this.adm = admin;
    }
}

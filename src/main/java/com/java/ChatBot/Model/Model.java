package com.java.ChatBot.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Usuarios")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String nomeUsuario;
    private String loginUsuario;
    private String emailUsuario;


    public Model () {
    }

    public Model(UUID id, String nomeUsuario, String loginUsuario, String emailUsuario) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.loginUsuario = loginUsuario;
    }

    public UUID getId() {
        return id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }
}

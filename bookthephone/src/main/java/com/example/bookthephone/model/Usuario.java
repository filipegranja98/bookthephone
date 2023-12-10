package com.example.bookthephone.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Usuario {
    @Column(nullable = false)
    protected String nome;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String email;
    @Column(nullable = false)
    protected String endereco;
    @Column(nullable = false)
    protected String numeroContato;
    public Usuario(String nome, String email, String endereco, String numeroContato) {

        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.numeroContato = numeroContato;

    }

    public void comentarEbook() {
        System.out.println("Bla bla bla");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumeroContato() {
        return numeroContato;
    }
    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }
}
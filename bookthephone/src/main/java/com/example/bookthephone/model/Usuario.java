package com.example.bookthephone.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Usuario {
    @Id
    private long id;
    @Column
    private String nome;
    @OneToOne
    private CarrinhoDeCompras carrinho;
    @Column
    private String email;
    @Column
    private String endereco;
    @Column
    private String NumeroContato;
    @OneToOne
    private Biblioteca biblioteca;
    public Usuario(){

    }
    public Usuario(long id, String nome, CarrinhoDeCompras carrinho, String email, String endereco, String numeroContato, Biblioteca biblioteca) {
        this.id = id;
        this.nome = nome;
        this.carrinho = carrinho;
        this.email = email;
        this.endereco = endereco;
        NumeroContato = numeroContato;
        this.biblioteca = biblioteca;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
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
        return NumeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        NumeroContato = numeroContato;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
}
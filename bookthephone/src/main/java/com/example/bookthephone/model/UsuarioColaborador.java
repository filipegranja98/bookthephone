package com.example.bookthephone.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
@Entity
public class UsuarioColaborador extends Usuario  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cpf;
    @OneToOne
    @JoinColumn(name = "carrinhodecompras", referencedColumnName = "carrinho")
    private CarrinhoDeCompras carrinho;
    @OneToOne
    @JoinColumn(name = "id_biblioteca", referencedColumnName = "id")
    private Biblioteca biblioteca;

    public UsuarioColaborador(String nome, String email, String endereco, String numeroContato, String cpf, CarrinhoDeCompras carrinho, Biblioteca biblioteca) {

        super(nome, email, endereco, numeroContato);

        this.cpf = cpf;
        this.carrinho = carrinho;
        this.biblioteca = biblioteca;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }
    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
}
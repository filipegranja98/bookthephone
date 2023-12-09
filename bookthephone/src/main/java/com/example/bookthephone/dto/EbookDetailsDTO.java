package com.example.bookthephone.dto;

import java.time.LocalDateTime;

public class EbookDetailsDTO {

    private long id;
    private String titulo;
    private String autor;
    private LocalDateTime dataPublicacao;
    private double preco;

    public EbookDetailsDTO() {
        // Construtor vazio necessário para frameworks de serialização
    }

    public EbookDetailsDTO(long id, String titulo, String autor, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = LocalDateTime.now();
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDateTime dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
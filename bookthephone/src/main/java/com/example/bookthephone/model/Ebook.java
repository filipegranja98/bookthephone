package com.example.bookthephone.model;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
@Entity
public class Ebook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;

    /*@Column(nullable = false)
    private Editora editora;*/

    @Column(nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dataPublicacao;

/*    @Column(nullable = false)
    private ArrayList<String> generoEbooks;*/

    @Column(nullable = false)
    private double preco;

    public Ebook () {}

    public Ebook(long id, String titulo, String autor /*Editora editora*//*, LocalDateTime dataPublicacao*/,/*ArrayList<String> generoEbooks*/ double preco) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
//        this.editora = editora;
//        this.dataPublicacao = LocalDateTime.now();
//        this.generoEbooks = generoEbooks;
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

//    public Editora getEditora() {
//        return editora;
//    }
//
//    public void setEditora(Editora editora) {
//        this.editora = editora;
//    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDateTime dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

//    public ArrayList<String> getGeneroEbooks() {
//        return generoEbooks;
//    }
//    public void setGeneroEbooks(ArrayList<String> generoEbooks) {
//        this.generoEbooks = generoEbooks;
//    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}

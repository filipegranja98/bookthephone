package com.example.bookthephone.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;
@Entity
public class Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "biblioteca",cascade = CascadeType.ALL)
    private Usuario usuario;

    @OneToMany(mappedBy = "biblioteca", cascade = CascadeType.ALL)
    private List<Ebook> ebooks;

    public Biblioteca(){
        this.ebooks = new ArrayList<>();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Ebook> getEbooks() {
        return ebooks;
    }

    public void setEbooks(List<Ebook> ebooks) {
        this.ebooks = ebooks;
    }

}

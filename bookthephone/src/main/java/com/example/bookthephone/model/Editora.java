package com.example.bookthephone.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Editora extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cnpj;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "editora")
    private List<Ebook> livrosPatrocinados = new ArrayList<>();


    public Editora(String nome, String email, String endereco, String numeroContato, String cnpj, ArrayList<Ebook> livrosPatrocinados) {
        super(nome, email, endereco, numeroContato);
        this.cnpj = cnpj;
        this.livrosPatrocinados = livrosPatrocinados;
    }


    public void patrocinarEbook(Ebook ebook) {
        livrosPatrocinados.add(ebook);
        System.out.println("Ebook patrocinado com sucesso pela editora " + cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Ebook> getLivrosPatrocinados() {
        return livrosPatrocinados;
    }

    public void setLivrosPatrocinados(ArrayList<Ebook> livrosPatrocinados) {
        this.livrosPatrocinados = livrosPatrocinados;
    }
}

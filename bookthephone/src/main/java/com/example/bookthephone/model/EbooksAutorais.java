package com.example.bookthephone.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity(name = "EbookAutorais")
@Getter
@Setter
@NoArgsConstructor
public class EbookAutorais extends Ebook {

    @Column(nullable = false)
    private LocalDate dataDeCriacao;

    public EbookAutorais(Long id, String titulo, String autor, double preco, LocalDate dataDeCriacao) {
        super(id, titulo, autor, preco);
        this.dataDeCriacao = dataDeCriacao;
    }
}

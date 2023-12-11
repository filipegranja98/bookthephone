package com.poo.aulaspring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity(name = "EbookAdquiridos")
@Getter
@Setter
@NoArgsConstructor
public class EbookAdquiridos extends Ebook {

    @Column(nullable = false)
    private LocalDateTime dataDeAquisicao;

    public EbookAdquiridos(Long id, String titulo, String autor, double preco, LocalDateTime dataDeAquisicao) {
        super(id, titulo, autor, preco);
        this.dataDeAquisicao = dataDeAquisicao;
    }
}
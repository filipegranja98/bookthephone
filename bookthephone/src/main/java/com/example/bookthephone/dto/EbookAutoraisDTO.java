package com.example.bookthephone.dto;

import java.util.Date;

public class EbookAutoraisDTO extends EbookDetailsDTO{
    private Date dataDeCriacao;

    public EbookAutoraisDTO(Date dataAquisicao) {
        this.dataDeCriacao = dataAquisicao;
    }

    public EbookAutoraisDTO(long id, String titulo, String autor, double preco, Date dataAquisicao) {
        super(id, titulo, autor, preco);
        this.dataDeCriacao = dataAquisicao;
    }

    public Date getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Date dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }
}

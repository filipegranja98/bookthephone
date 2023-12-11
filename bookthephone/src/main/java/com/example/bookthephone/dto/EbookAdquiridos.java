package com.example.bookthephone.dto;
import java.util.Date;
public class EbookAdquiridos extends EbookDetailsDTO{
    private Date dataAquisicao;

    public EbookAdquiridos(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public EbookAdquiridos(long id, String titulo, String autor, double preco, Date dataAquisicao) {
        super(id, titulo, autor, preco);
        this.dataAquisicao = dataAquisicao;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
}

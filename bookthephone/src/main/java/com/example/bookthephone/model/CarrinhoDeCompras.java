package com.example.bookthephone.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class CarrinhoDeCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Ebook> ebooks;

    @Column(name = "valor_total", nullable = false)
    private double valorTotal;

    @Column(name = "data_compra", nullable = false)
    private LocalDateTime dataCompra;

    public CarrinhoDeCompras() {
        
    }

    public CarrinhoDeCompras(List<Ebook> ebooks, double valorTotal, LocalDateTime dataCompra) {
        this.ebooks = ebooks;
        this.valorTotal = valorTotal;
        this.dataCompra = dataCompra;
    }


   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Ebook> getEbooks() {
        return ebooks;
    }

    public void setEbooks(List<Ebook> ebooks) {
        this.ebooks = ebooks;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }
}

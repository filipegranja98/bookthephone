package com.example.bookthephone.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarrinhoDeComprasService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

public List<CarrinhoDeCompras> encontrarCarrinhosPorIdDoEbook(Long ebookId) {
        return carrinhoRepository.findByEbooksId(ebookId);
    }

    private List<Ebook> ebooks;
    private double valorTotal;
    private LocalDateTime dataCompra;

    public CarrinhoDeComprasService() {
        this.ebooks = new ArrayList<>();
        this.valorTotal = 0.0;
        this.dataCompra = LocalDateTime.now();
    }

    public void addAoCarrinho(Ebook ebook) {
        ebooks.add(ebook);
        valorTotal += ebook.getPreco();
        System.out.println(ebook.getTitulo() + " adicionado ao carrinho.");
    }

    public void removerDoCarrinho(Ebook ebook) {
        if (ebooks.remove(ebook)) {
            valorTotal -= ebook.getPreco();
            System.out.println(ebook.getTitulo() + " removido do carrinho.");
        } else {
            System.out.println("O ebook não foi encontrado no carrinho.");
        }
    }

    public void realizarPagamento() {
        // Lógica para processar o pagamento (pode ser implementada posteriormente)
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Ebooks comprados:");
        for (Ebook ebook : ebooks) {
            System.out.println("- " + ebook.getTitulo());
        }

        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(ebooks, valorTotal, dataCompra);
        carrinhoRepository.save(carrinho);

      
    }
}

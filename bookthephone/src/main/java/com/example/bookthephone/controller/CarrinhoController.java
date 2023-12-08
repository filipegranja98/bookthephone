package com.example.bookthephone.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController - 
@RequestMapping("/carrinho") - 
public class CarrinhoController {

    @Autowired - 
    private CarrinhoDeComprasService carrinhoDeComprasService;

@GetMapping("/por-ebook/{ebookId}")
    public List<CarrinhoDeCompras> encontrarCarrinhosPorIdDoEbook(@PathVariable Long ebookId) {
        return carrinhoDeComprasService.encontrarCarrinhosPorIdDoEbook(ebookId);
    }

    @PostMapping("/adicionar")
    public void adicionarAoCarrinho(@RequestBody Ebook ebook) {
        carrinhoDeComprasService.addAoCarrinho(ebook);
    }

    @PostMapping("/remover")
    public void removerDoCarrinho(@RequestBody Ebook ebook) {
        carrinhoDeComprasService.removerDoCarrinho(ebook);
    }

    @PostMapping("/pagar")
    public void realizarPagamento() {
        carrinhoDeComprasService.realizarPagamento();
    }
}

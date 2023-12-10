package com.example.bookthephone.controller;

import com.example.bookthephone.dto.EbookDetailsDTO;
import com.example.bookthephone.model.Biblioteca;
import com.example.bookthephone.model.Ebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bookthephone.service.BibliotecaService;
import java.util.List;


@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {
    private final BibliotecaService bibliotecaservice;
    private final List<EbookDetailsDTO> ebooks;
    private final EbookDetailsDTO ebook;
    private final Biblioteca biblioteca;
    private final Ebook ebook1;
    @Autowired
    public BibliotecaController(BibliotecaService bibliotecaService, List<EbookDetailsDTO> ebooks, EbookDetailsDTO ebook, Biblioteca biblioteca, Ebook ebook1){this.bibliotecaservice = bibliotecaService;
        this.ebooks = ebooks;
        this.ebook = ebook;
        this.biblioteca = biblioteca;
        this.ebook1 = ebook1;
    }

    @GetMapping
    public void listarTodosEbooks(){ bibliotecaservice.listaTodosEbooks(ebooks);}

    @GetMapping
    public void listarEbooksAutorais(){bibliotecaservice.listarEbooksAutorais(ebooks);}
    @GetMapping
    public void listarEbooksAdquiridos(){bibliotecaservice.listarEbookAdquiridos(ebooks);}

    @PostMapping
    public  void addEbook(){bibliotecaservice.addEbook(biblioteca,ebook1);}

    @DeleteMapping
    public void excluirEbook(Biblioteca biblioteca, Ebook ebook){
        bibliotecaservice.excluirEbook( biblioteca,ebook);
    }

}

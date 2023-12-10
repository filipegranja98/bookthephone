package com.example.bookthephone.service;

import com.example.bookthephone.dto.EbookAdquiridos;
import com.example.bookthephone.dto.EbookAutoraisDTO;
import com.example.bookthephone.dto.EbookDetailsDTO;
import com.example.bookthephone.model.Biblioteca;
import com.example.bookthephone.model.Ebook;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookthephone.repository.BibliotecaRepository;

import java.util.List;

@Service
public class BibliotecaService {
    private final BibliotecaRepository bibliotecaRepository;
    private final EbookDetailsDTO ebook;



    @Autowired
    public BibliotecaService(BibliotecaRepository bibliotecaRepository, EbookService ebookService, EbookDetailsDTO ebook) {
        this.bibliotecaRepository = bibliotecaRepository;
        this.ebook = ebook;

    }

    public void listaTodosEbooks(List<EbookDetailsDTO> ebooks) {
        for (EbookDetailsDTO ebook : ebooks) {
            System.out.println("Titulo: " + ebook.getTitulo());
            System.out.println("Author: " + ebook.getAutor());
            System.out.println("Data de Publicação: " + ebook.getDataPublicacao());
            System.out.println("Preço: " + ebook.getPreco());
        }
    }

    public void listarEbooksAutorais(List<EbookDetailsDTO> ebooks) {
        for (EbookDetailsDTO ebook : ebooks) {
            if (ebooks instanceof EbookAutoraisDTO) {
                System.out.println("Titulo: " + ((EbookAutoraisDTO) ebooks).getTitulo());
                System.out.println("Author: " + ((EbookAutoraisDTO) ebooks).getAutor());
                System.out.println("Data de Publicação: " + ((EbookAutoraisDTO) ebooks).getDataDeCriacao());
                System.out.println("Preço: " + ((EbookAutoraisDTO) ebooks).getPreco());

            }
        }
    }

    public void listarEbookAdquiridos(List<EbookDetailsDTO> ebooks) {
        for (EbookDetailsDTO ebook : ebooks) {
            if (ebooks instanceof EbookAdquiridos) {
                System.out.println("Titulo" + ((EbookAdquiridos) ebooks).getTitulo());
                System.out.println(("Autor: " + ((EbookAdquiridos) ebooks).getAutor()));
                System.out.println("Data de Publicação: " + ((EbookAdquiridos) ebooks).getDataPublicacao());
                System.out.println("Preço: " + ((EbookAdquiridos) ebooks).getDataAquisicao());
                System.out.println("Data de Aquisição: " + ((EbookAdquiridos) ebooks).getDataAquisicao());

            }
        }
    }
    public void addEbook(Biblioteca biblioteca, Ebook ebook) {
        if (!biblioteca.getEbooks().contains(ebook)) {
            biblioteca.getEbooks().add(ebook);
            bibliotecaRepository.save(biblioteca);
        } else {
            System.out.println("O eBook já está na biblioteca.");
        }
    }
    public void excluirEbook(Biblioteca biblioteca, Ebook ebook) {
        if (biblioteca.getEbooks().contains(ebook)) {
            biblioteca.getEbooks().remove(ebook);
            bibliotecaRepository.save(biblioteca);
        } else {
            System.out.println("O eBook não está na biblioteca.");
        }
    }
}

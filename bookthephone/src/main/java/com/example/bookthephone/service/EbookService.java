package com.example.bookthephone.service;

import com.example.bookthephone.model.Ebook;
import com.example.bookthephone.repository.EbookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EbookService {

    private final EbookRepository ebookRepository;

    @Autowired
    public EbookService(EbookRepository ebookRepository){

        this.ebookRepository = ebookRepository;
    }
    public Ebook criarEbook(Ebook ebook) {

        return ebookRepository.save(ebook);
    }

    public Ebook retornarEbookPelotitulo(String titulo){

        return ebookRepository.findByTitulo(titulo);
    }

    public Ebook obterEbookPorId(Long id) {
        return ebookRepository.findById(id).orElse(null);
    }

    public EbookDetailsDTO mostrarDetalhes(Ebook ebook) {
        EbookDetailsDTO ebookDetails = new EbookDetailsDTO();
        ebookDetails.setId(ebook.getId());
        ebookDetails.setTitulo(ebook.getTitulo());
        ebookDetails.setAutor(ebook.getAutor());
        ebookDetails.setDataPublicacao(ebook.getDataPublicacao());
        ebookDetails.setPreco(ebook.getPreco());

        return ebookDetails;
    }
}

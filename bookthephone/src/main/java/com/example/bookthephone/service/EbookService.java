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
}

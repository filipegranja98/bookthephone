package com.example.bookthephone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookthephone.repository.BibliotecaRepository;

@Service
public class BibliotecaService {
    private final BibliotecaRepository bibliotecaRepository;


    @Autowired
    public BibliotecaService(BibliotecaRepository bibliotecaRepository, EbookService ebookService) {
        this.bibliotecaRepository = bibliotecaRepository;
    }
}

package com.example.bookthephone.service;

import com.example.bookthephone.model.EbookAutorais;
import com.example.bookthephone.repository.EbookAutoraisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EbookAutoraisService {

    private final EbookAutoraisRepository ebookAutoraisRepository;

    @Autowired
    public EbookAutoraisService(EbookAutoraisRepository ebookAutoraisRepository) {
        this.ebookAutoraisRepository = ebookAutoraisRepository;
    }

    public EbookAutorais criarEbookAutorais(EbookAutorais ebookAutorais) {
        return ebookAutoraisRepository.save(ebookAutorais);
    }
}

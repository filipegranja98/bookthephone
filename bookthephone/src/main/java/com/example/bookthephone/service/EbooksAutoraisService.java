package com.poo.aulaspring.service;

import com.poo.aulaspring.model.EbookAutorais;
import com.poo.aulaspring.repository.EbookAutoraisRepository;
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

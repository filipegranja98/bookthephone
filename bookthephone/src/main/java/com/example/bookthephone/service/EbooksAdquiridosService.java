package com.example.bookthephone.service;

import com.example.bookthephone.EbookAdquiridos;
import com.example.bookthephone.repository.EbookAdquiridosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EbookAdquiridosService {

    private final EbookAdquiridosRepository ebookAdquiridosRepository;

    @Autowired
    public EbookAdquiridosService(EbookAdquiridosRepository ebookAdquiridosRepository) {
        this.ebookAdquiridosRepository = ebookAdquiridosRepository;
    }

    public EbookAdquiridos criarEbookAdquiridos(EbookAdquiridos ebookAdquiridos) {
        return ebookAdquiridosRepository.save(ebookAdquiridos);
    }
}

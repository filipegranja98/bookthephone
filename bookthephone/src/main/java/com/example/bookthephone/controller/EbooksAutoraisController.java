package com.example.bookthephone.controller;

import com.example.bookthephone.model.EbookAutorais;
import com.example.bookthephone.service.EbookAutoraisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ebook-autorais")
public class EbookAutoraisController {

    private final EbookAutoraisService ebookAutoraisService;

    @Autowired
    public EbookAutoraisController(EbookAutoraisService ebookAutoraisService) {
        this.ebookAutoraisService = ebookAutoraisService;
    }

    @PostMapping
    public ResponseEntity<EbookAutorais> criarEbookAutorais(@RequestBody EbookAutorais ebookAutorais) {
        EbookAutorais novoEbookAutorais = ebookAutoraisService.criarEbookAutorais(ebookAutorais);
        return new ResponseEntity<>(novoEbookAutorais, HttpStatus.CREATED);
    }
}

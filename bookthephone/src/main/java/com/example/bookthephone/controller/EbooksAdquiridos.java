package com.example.bookthephone.controller;

import com.example.bookthephone.model.EbookAdquiridos;
import com.example.bookthephone.service.EbookAdquiridosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ebook-adquiridos")
public class EbookAdquiridosController {

    private final EbookAdquiridosService ebookAdquiridosService;

    @Autowired
    public EbookAdquiridosController(EbookAdquiridosService ebookAdquiridosService) {
        this.ebookAdquiridosService = ebookAdquiridosService;
    }

    @PostMapping
    public ResponseEntity<EbookAdquiridos> criarEbookAdquiridos(@RequestBody EbookAdquiridos ebookAdquiridos) {
        EbookAdquiridos novoEbookAdquiridos = ebookAdquiridosService.criarEbookAdquiridos(ebookAdquiridos);
        return new ResponseEntity<>(novoEbookAdquiridos, HttpStatus.CREATED);
    }
}

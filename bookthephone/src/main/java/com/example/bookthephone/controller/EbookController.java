package com.example.bookthephone.controller;

import com.example.bookthephone.model.Ebook;
import com.example.bookthephone.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EbookController {
    private final EbookService ebookService;


    @Autowired
    public EbookController(EbookService ebookService) {

        this.ebookService = ebookService;
    }
    
    @PostMapping
    public Ebook criarEbook(@RequestBody Ebook ebook){

        return ebookService.criarEbook(ebook);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ebook> obterEbookPorId(@PathVariable Long id) {
        Ebook ebook = ebookService.obterEbookPorId(id);
        if (ebook != null) {
            return ResponseEntity.ok(ebook);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

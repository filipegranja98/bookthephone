package com.example.bookthephone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookthephone.service.BibliotecaService;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {
    private final BibliotecaService bibliotecaservice;

    @Autowired
    public BibliotecaController(BibliotecaService bibliotecaService){this.bibliotecaservice = bibliotecaService;}
}

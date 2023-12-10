package com.example.bookthephone.service;

import com.example.bookthephone.model.Usuario;
import com.example.bookthephone.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookthephone.repository.UsuarioColaboradorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioColaboradorService {

    private final UsuarioColaboradorRepository usuarioColaboradorRepository;
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioColaborador(UsuarioColaboradorRepository usuarioColaboradorRepository, UsuarioRepository usuarioRepository) {
        this.usuarioColaboradorRepository = usuarioColaboradorRepository;
        this.usuarioRepository = usuarioRepository;
    }
}

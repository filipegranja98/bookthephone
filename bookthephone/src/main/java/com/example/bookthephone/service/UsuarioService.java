package com.example.bookthephone.service;

import com.example.bookthephone.model.Usuario;
import com.example.bookthephone.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;

    }
    public Usuario criarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> retornarUsuarioPeloNome(String nome){
        return Optional.ofNullable(usuarioRepository.findByNome(nome));
    }

    @Autowired
    public void comentarEbook() {
        System.out.println("Bla bla bla");
    }
}

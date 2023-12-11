package com.example.bookthephone.service;

import com.example.bookthephone.model.Ebook;
import com.example.bookthephone.model.Usuario;
import com.example.bookthephone.model.UsuarioColaborador;
import com.example.bookthephone.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookthephone.repository.UsuarioColaboradorRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioColaboradorService {

   // private final UsuarioColaboradorRepository usuarioColaboradorRepository;
   // private final UsuarioRepository usuarioRepository;

   // @Autowired
    //public UsuarioColaborador(UsuarioColaboradorRepository usuarioColaboradorRepository, UsuarioRepository usuarioRepository) {
        //this.usuarioColaboradorRepository = usuarioColaboradorRepository;
        //this.usuarioRepository = usuarioRepository;
  // }

    @Autowired
    public void adiquirirEbook(Ebook ebook){
        carrinho.addAoCarrinho(ebook);
    }
    public Ebook postarEbook(String titulo, UsuarioColaborador autor, Editoras editora, LocalDate dataPublicacao, ArrayList<String> generos, double preco, Editoras patrocinio, LocalDateTime localDateTime){
        Ebook e = new EbooksAutorais(titulo, autor, editora, dataPublicacao, generos, preco, patrocinio, localDateTime);
        return e;
    }
}

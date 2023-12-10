package com.example.bookthephone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    public Usuario findByNome(String nome);

}
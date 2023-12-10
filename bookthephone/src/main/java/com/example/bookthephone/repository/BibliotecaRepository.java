package com.example.bookthephone.repository;

import com.example.bookthephone.model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {

    Biblioteca findByUsuarioId(long usuarioId);

}

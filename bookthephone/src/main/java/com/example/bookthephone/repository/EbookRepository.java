package com.example.bookthephone.repository;

import com.example.bookthephone.model.Ebook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EbookRepository extends JpaRepository<Ebook, Long> {

    public Ebook findByTitulo(String titulo);
}

package com.example.bookthephone.repository;

import com.example.bookthephone.model.EbookAutorais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EbookAutoraisRepository extends JpaRepository<EbookAutorais, Long> {
}

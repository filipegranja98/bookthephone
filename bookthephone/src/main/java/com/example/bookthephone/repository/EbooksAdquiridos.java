package com.example.bookthephone.repository;

import com.example.bookthephone.model.EbookAdquiridos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EbookAdquiridosRepository extends JpaRepository<EbookAdquiridos, Long> {
    
}
package com.example.bookthephone.repository;
import com.example.bookthephone.model.CarrinhoDeCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CarrinhoRepository extends JpaRepository<CarrinhoDeCompras, Long> {

  public List<CarrinhoDeCompras> findByEbooksId(Long ebookId);

}

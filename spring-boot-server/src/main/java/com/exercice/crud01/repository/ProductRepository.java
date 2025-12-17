package com.exercice.crud01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercice.crud01.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String name);

    List<Product> findByDescriptionContaining(String description);

    List<Product> findByPriceLessThanEqual(Double price);

    List<Product> findByPriceGreaterThanEqual(Double price);

    @org.springframework.data.jpa.repository.Query("SELECT p FROM Product p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :text, '%')) OR LOWER(p.description) LIKE LOWER(CONCAT('%', :text, '%')) ORDER BY CASE WHEN LOWER(p.name) LIKE LOWER(CONCAT('%', :text, '%')) THEN 0 ELSE 1 END")
    List<Product> searchByTextAndRank(@org.springframework.data.repository.query.Param("text") String text);

}

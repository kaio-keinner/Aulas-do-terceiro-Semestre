package com.tads4.ecmmerce.repositories;
import com.tads4.ecmmerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
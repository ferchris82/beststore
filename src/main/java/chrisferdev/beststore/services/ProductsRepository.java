package chrisferdev.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import chrisferdev.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{
    
}

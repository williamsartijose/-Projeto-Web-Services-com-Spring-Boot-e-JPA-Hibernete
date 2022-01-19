package com.williamsarti.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.williamsarti.ProjetoSpring.entities.Product;




public interface ProductRepository extends JpaRepository<Product, Long> {

}

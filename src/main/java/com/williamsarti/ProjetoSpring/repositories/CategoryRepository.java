package com.williamsarti.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamsarti.ProjetoSpring.entities.Category;




public interface CategoryRepository extends JpaRepository<Category, Long> {

}

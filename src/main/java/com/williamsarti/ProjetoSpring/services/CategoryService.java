package com.williamsarti.ProjetoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamsarti.ProjetoSpring.entities.Category;
import com.williamsarti.ProjetoSpring.repositories.CategoryRepository;


@Service
public class CategoryService {
	
	
	@Autowired
	private CategoryRepository repository;
	
	//Buscar a tabela Category
	public  List<Category> findAll(){
		return repository.findAll();
	}

	//Busca Usuario por ID
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}

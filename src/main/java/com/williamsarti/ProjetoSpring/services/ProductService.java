package com.williamsarti.ProjetoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamsarti.ProjetoSpring.entities.Product;
import com.williamsarti.ProjetoSpring.repositories.ProductRepository;


@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository repository;
	
	//Buscar a tabela Product
	public  List<Product> findAll(){
		return repository.findAll();
	}

	//Busca Usuario por ID
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}

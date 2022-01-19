package com.williamsarti.ProjetoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamsarti.ProjetoSpring.entities.Order;
import com.williamsarti.ProjetoSpring.repositories.OrderRepository;


@Service
public class OrderService {
	
	
	@Autowired
	private OrderRepository repository;
	
	//Buscar a tabela Order
	public  List<Order> findAll(){
		return repository.findAll();
	}

	//Busca Usuario por ID
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}

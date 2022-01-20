package com.williamsarti.ProjetoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamsarti.ProjetoSpring.entities.User;
import com.williamsarti.ProjetoSpring.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	// Buscar a tabela User
	public List<User> findAll() {
		return repository.findAll();
	}

	// Busca Usuario por ID
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

	// inserir no banco
	public User insert(User obj) {
		return repository.save(obj);
	}

	// Deletar no banco
	public void delete(Long id) {
		repository.deleteById(id);
	}
}

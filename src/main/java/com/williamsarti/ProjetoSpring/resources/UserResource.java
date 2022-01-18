package com.williamsarti.ProjetoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williamsarti.ProjetoSpring.entities.User;
import com.williamsarti.ProjetoSpring.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		//User u = new User(1L, "William", "Williamsartijose@hotmail.com", "18997874643" ,"1234567")
        List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);

		
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findAll(@PathVariable Long id){
    User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

		
	}
}

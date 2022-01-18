package com.williamsarti.ProjetoSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williamsarti.ProjetoSpring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "William", "Williamsartijose@hotmail.com", "18997874643" ,"1234567");
		return ResponseEntity.ok().body(u);

		
	}

}

package com.williamsarti.ProjetoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williamsarti.ProjetoSpring.entities.Category;
import com.williamsarti.ProjetoSpring.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	
	
	@Autowired
	private CategoryService service;
	//endpoints buscar por categoria
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		//Category u = new Category(1L, "William", "Williamsartijose@hotmail.com", "18997874643" ,"1234567")
        List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);

		
	}
	
	//endpoints buscar por ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findAll(@PathVariable Long id){
    Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

		
	}
}

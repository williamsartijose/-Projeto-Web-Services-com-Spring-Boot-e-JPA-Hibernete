package com.williamsarti.ProjetoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williamsarti.ProjetoSpring.entities.Product;
import com.williamsarti.ProjetoSpring.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		//Product u = new Product(1L, "William", "Williamsartijose@hotmail.com", "18997874643" ,"1234567")
        List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);

		
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findAll(@PathVariable Long id){
    Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

		
	}
}

package com.ranjanit.restapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ranjanit.restapi.product.Product;
import com.ranjanit.restapi.repository.ProductRepository;

@RestController
public class ProductRestController {
	@Autowired
	private ProductRepository dao;
    
	@PostMapping(value="/savebook")
	public ResponseEntity<String> saveBooks(@RequestBody Product product) {
		dao.save(product);
		return new ResponseEntity<>("record saved", HttpStatus.CREATED);

	}
	@GetMapping(value="/getbook")
	public ResponseEntity<List<Product>> getBooks() {
		List<Product> findAll = dao.findAll();
		return new ResponseEntity<>(findAll, HttpStatus.OK);

	}

}

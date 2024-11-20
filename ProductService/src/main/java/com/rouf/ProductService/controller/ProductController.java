package com.rouf.ProductService.controller;

import com.rouf.ProductService.data.entity.ProductEntity;
import com.rouf.ProductService.data.model.ProductRequest;
import com.rouf.ProductService.data.model.ProductResponse;
import com.rouf.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/add-product")
	public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest){
		long productId = productService.addProduct(productRequest);
		return new ResponseEntity<>(productId, HttpStatus.CREATED);
	}

	@GetMapping("/get-product-by-id/{id}")
	public ResponseEntity<ProductResponse> getProductById(@PathVariable("id") long productId) {
		ProductResponse productResponse = productService.getProductByID(productId);
		return new ResponseEntity<>(productResponse, HttpStatus.OK);
	}
}

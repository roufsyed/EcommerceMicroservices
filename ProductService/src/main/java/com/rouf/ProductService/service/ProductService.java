package com.rouf.ProductService.service;

import com.rouf.ProductService.data.model.ProductRequest;
import com.rouf.ProductService.data.model.ProductResponse;


public interface ProductService {
	long addProduct( ProductRequest productRequest );

	ProductResponse getProductByID(long productId);
}

package com.rouf.ProductService.service;

import com.rouf.ProductService.data.entity.ProductEntity;
import com.rouf.ProductService.data.model.ProductRequest;
import com.rouf.ProductService.data.model.ProductResponse;
import com.rouf.ProductService.exception.ProductServiceCustomException;
import com.rouf.ProductService.repository.ProductRepository;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Log4j2
public class ProductServiceImplmentation implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public long addProduct( ProductRequest productRequest ) {

		log.info("Adding product");

		ProductEntity productEntity = ProductEntity.builder()
				.productName(productRequest.getProductName())
				.quantity(productRequest.getQuantity())
				.price(productRequest.getPrice())
				.build();

		productRepository.save(productEntity);

		log.info("Product Added: " + productEntity.getProductId());
		return productEntity.getProductId();
	}


	@Override
	public ProductResponse getProductByID( long productId ) {
		log.info("Getting product by ID: "+productId);
		ProductEntity productEntity = productRepository.findById(productId)
				.orElseThrow(
						() -> new ProductServiceCustomException("Product with the given ID not found", "PRODUCT_NOT_FOUND")
				);

		ProductResponse productResponse = new ProductResponse();
		BeanUtils.copyProperties(productEntity, productResponse);

		return productResponse;
	}
}
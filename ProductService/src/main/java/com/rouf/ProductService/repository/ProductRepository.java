package com.rouf.ProductService.repository;

import com.rouf.ProductService.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository< ProductEntity, Long > {
}
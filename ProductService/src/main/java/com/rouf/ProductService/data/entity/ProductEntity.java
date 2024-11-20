package com.rouf.ProductService.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long productId;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "PRICE")
	private long price;

	@Column(name = "QUANTITY")
	private long quantity;
}

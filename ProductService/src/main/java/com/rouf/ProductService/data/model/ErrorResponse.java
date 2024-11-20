package com.rouf.ProductService.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {
	private Int errorCode;
	private String errorMessage;
}

package com.rouf.ProductService.exception;

import com.rouf.ProductService.data.model.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	public ResponseEntity<ErrorResponse> handleProductServiceException(ProductServiceCustomException) {

	}
}

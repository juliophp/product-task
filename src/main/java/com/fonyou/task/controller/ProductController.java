package com.fonyou.task.controller;

import com.fonyou.task.dto.SuccessResponse;
import com.fonyou.task.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;


	@GetMapping("/amount/{id}")
	public ResponseEntity<SuccessResponse> getCapacityBySerialId(@PathVariable String id) {
		return new ResponseEntity<>(new SuccessResponse(productService.getAmountFromProductId(id)), HttpStatus.OK);
	}


}
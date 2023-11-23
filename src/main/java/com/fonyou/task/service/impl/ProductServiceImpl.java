package com.fonyou.task.service.impl;

import com.fonyou.task.exception.CustomException;
import com.fonyou.task.model.Product;
import com.fonyou.task.repository.ProductRepository;
import com.fonyou.task.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.*;


@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;


	@Override
	public BigDecimal getAmountFromProductId(String productId) {
		Optional<Product> product = productRepository.findById(productId);
		Product p =  product.orElseThrow(() -> CustomException.as("product with serial number not found"));
		return p.getAmount();
	}
}
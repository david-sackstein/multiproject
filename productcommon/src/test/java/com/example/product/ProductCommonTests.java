package com.example.product;

import org.junit.Test;

public class ProductCommonTests {

	@Test
	public void contextLoads() {
		System.out.printf("%s\n", ProductFactory.createProduct());
	}
}

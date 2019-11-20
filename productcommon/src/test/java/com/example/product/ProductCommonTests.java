package com.example.product;

import org.junit.jupiter.api.Test;

class ProductCommonTests {

	@Test
	void test1() {
		System.out.printf("%s\n", ProductFactory.createProduct());
	}
}

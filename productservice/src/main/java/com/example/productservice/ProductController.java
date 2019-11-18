package com.example.productservice;

import com.example.product.ProductFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping(value = "helloworld")
    public String GetHelloWorld() {
        return ProductFactory.createProduct();
    }
}

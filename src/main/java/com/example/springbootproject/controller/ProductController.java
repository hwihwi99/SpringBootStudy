package com.example.springbootproject.controller;

import com.example.springbootproject.data.dto.ProductDTO;
import com.example.springbootproject.service.ProductService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/product-api")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8080/api/v1/product-api/product/{productId}
    @GetMapping(value = "/product/{productId}")
    public ProductDTO getProduct(@PathVariable String productId) {
        ProductDTO productDto = productService.getProduct(productId);
        return productDto;
    }

    // http://localhost:8080/api/v1/product-api/product
    @PostMapping(value = "/product")
    public ProductDTO createProduct(@RequestBody ProductDTO productDto) {

        String productId = productDto.getProductId();
        String productName = productDto.getProductName();
        int productPrice = productDto.getProductPrice();
        int productStock = productDto.getProductStock();

        return productService.saveProduct(productId,productName,productPrice,productStock);
    }

    // http://localhost:8080/api/v1/product-api/product/{productId}
    @DeleteMapping(value = "/product/{productId}")
    public ProductDTO deleteProduct(@PathVariable String productId) {
        return null;
    }

}

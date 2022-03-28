package com.example.springbootproject.service;

import com.example.springbootproject.data.dto.ProductDTO;
import org.springframework.stereotype.Service;

public interface ProductService {

    ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDTO getProduct(String productId);

}

package com.example.springbootproject.service.Impl;

import com.example.springbootproject.data.dto.ProductDTO;
import com.example.springbootproject.data.entity.ProductEntity;
import com.example.springbootproject.handler.ProductDataHandler;
import com.example.springbootproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    ProductDataHandler productDataHandler;

    @Autowired
    public ProductServiceImpl(ProductDataHandler productDataHandler) {
        this.productDataHandler = productDataHandler;
    }

    @Override
    public ProductDTO saveProduct(String productId, String productName, int productPrice,
                                  int productStock) {

        ProductEntity product = productDataHandler.saveProductEntity(productId, productName,
                productPrice, productStock);

        ProductDTO productDto = new ProductDTO(product.getProductId(),
                product.getProductName(), product.getProductPrice(),
                product.getProductStock());

        return productDto;
    }

    @Override
    public ProductDTO getProduct(String productId) {

        ProductEntity product = productDataHandler.getProductEntity(productId);

        ProductDTO productDto = new ProductDTO(product.getProductId(),
                product.getProductName(), product.getProductPrice(),
                product.getProductStock());

        return productDto;
    }
}
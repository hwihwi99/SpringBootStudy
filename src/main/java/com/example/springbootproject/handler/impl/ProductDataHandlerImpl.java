package com.example.springbootproject.handler.impl;

import com.example.springbootproject.data.dao.ProductDAO;
import com.example.springbootproject.data.entity.ProductEntity;
import com.example.springbootproject.handler.ProductDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDataHandlerImpl implements ProductDataHandler {
    ProductDAO productDAO;

    @Autowired
    public ProductDataHandlerImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock) {
        ProductEntity product = new ProductEntity(productId, productName, productPrice, productStock);
        return productDAO.saveProduct(product);
    }

    @Override
    public ProductEntity getProductEntity(String productId) {
        return productDAO.getProduct(productId);
    }
}

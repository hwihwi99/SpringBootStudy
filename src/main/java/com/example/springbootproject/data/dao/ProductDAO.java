package com.example.springbootproject.data.dao;

import com.example.springbootproject.data.entity.ProductEntity;

public interface ProductDAO {
    ProductEntity saveProduct(ProductEntity productEntity);
    ProductEntity getProduct(String productId);
}

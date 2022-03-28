package com.example.springbootproject.handler;

import com.example.springbootproject.data.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);

    ProductEntity getProductEntity(String productId);

}

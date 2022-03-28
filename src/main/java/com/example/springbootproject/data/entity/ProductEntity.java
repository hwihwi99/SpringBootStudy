package com.example.springbootproject.data.entity;

import com.example.springbootproject.data.dto.ProductDTO;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="product")
public class ProductEntity {
    @Id
    String productId;
    String productName;
    Integer productPrice;
    Integer productStock;

    public ProductDTO toDto() {
        return ProductDTO.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }
}

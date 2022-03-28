package com.example.springbootproject.data.repository;

import com.example.springbootproject.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * extends를 해준다.
 * JpaRepository <레포지토리가 사용할 entity, 이 entity의 id값의 데이터타입>
 * 이런식으로 사용해준다.
 */
public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}

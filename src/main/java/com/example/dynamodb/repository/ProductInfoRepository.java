package com.example.dynamodb.repository;

import com.example.dynamodb.models.ProductInfo;
import java.util.List;
import java.util.Optional;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface ProductInfoRepository extends CrudRepository<ProductInfo, String> {

    List<ProductInfo> findAll();
    Optional<ProductInfo> findById(String id);
}

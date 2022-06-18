package com.example.dynamodb.models;

import java.util.List;

public interface ProductGateway {

    List<ProductInfo> findAll();
}

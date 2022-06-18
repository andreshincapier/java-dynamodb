package com.example.dynamodb.service;

import com.example.dynamodb.models.ProductInfo;
import com.example.dynamodb.models.ProductInfoDTO;
import com.example.dynamodb.repository.ProductInfoRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductInfoService {

    private final ProductInfoRepository productInfoRepository;

    public List<ProductInfo> findAll() {
        return productInfoRepository.findAll();
    }

    public ProductInfo save(final ProductInfoDTO dto) {

        final ProductInfo p = ProductInfo.builder().id(dto.getId())
            .msrp(dto.getMsrp())
            .cost(dto.getCost())
            .build();

        return productInfoRepository.save(p);
    }
}

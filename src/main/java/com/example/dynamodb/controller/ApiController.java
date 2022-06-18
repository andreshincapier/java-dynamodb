package com.example.dynamodb.controller;

import com.example.dynamodb.models.ProductInfo;
import com.example.dynamodb.models.ProductInfoDTO;
import com.example.dynamodb.service.ProductInfoService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class ApiController {

    private final ProductInfoService productInfoService;

    @GetMapping(path = "/findAll")
    public List<ProductInfo> findAllProducts() {
        return productInfoService.findAll();
    }

    @PostMapping(path = "/save")
    public ProductInfo saveProduct(@RequestBody final ProductInfoDTO dto) {
        log.info("HERE IS PRODUCT INFO {}", dto);
        return productInfoService.save(dto);
    }
}

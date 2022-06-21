package com.example.dynamodb.controller;

import com.example.dynamodb.models.Notifications;
import com.example.dynamodb.models.NotificationsDTO;
import com.example.dynamodb.service.ProductInfoService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class ApiController {

    private final ProductInfoService productInfoService;

    @GetMapping(path = "/findAll")
    public List<Notifications> findAllProducts() {
        return productInfoService.findAll();
    }

    @GetMapping(path = "/find-by-id/{id}")
    public Notifications findById(@PathVariable String id) {
        return productInfoService.findById(id);
    }

    @PostMapping(path = "/save")
    public Notifications saveProduct(@RequestBody final NotificationsDTO dto) {
        log.info("HERE IS PRODUCT INFO {}", dto);
        return productInfoService.save(dto);
    }
}

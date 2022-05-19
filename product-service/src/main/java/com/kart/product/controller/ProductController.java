package com.kart.product.controller;


import com.kart.product.dto.ProductDto;
import com.kart.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
@Slf4j
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("save")
    public ProductDto save(@RequestBody ProductDto productDto) {
        log.info("Inside save of ProductController");
        return productService.save(productDto);
    }

    @GetMapping
    public ProductDto getById(@RequestParam(name = "id", required = true) Long id) {
        log.info("Inside getById of ProductController");
        return productService.get(id);
    }

    @GetMapping("all")
    public List<ProductDto> getAll() {
        log.info("Inside getAll of ProductController");
        return productService.getAll();
    }

    @GetMapping("/message")
    public String test() {
        log.info("Inside test of ProductController");
        return "Hello From Product";
    }
}

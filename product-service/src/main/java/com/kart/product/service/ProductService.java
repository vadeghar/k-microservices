package com.kart.product.service;

import com.kart.product.dto.ProductDto;
import com.kart.product.dto.ProductImageDto;
import com.kart.product.entity.Product;
import com.kart.product.entity.ProductImage;
import com.kart.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductService {
    ProductRepository productRepository;
    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<ProductDto> getAll() {
        log.info("Inside getAll of ProductService");
        List<Product> dbList = productRepository.findAll();
        return dbList.stream().map(p->entityToDto(p)).collect(Collectors.toList());
    }

    public ProductDto save(ProductDto productDto) {
        log.info("Inside save of ProductService");
        Product savedProduct = productRepository.save(dtoToEntity(productDto));
        return entityToDto(savedProduct);
    }

    public ProductDto get(Long id) {
        log.info("Inside get of ProductService");
        Product product = productRepository.getById(id);
        return entityToDto(product);
    }

    private Product dtoToEntity(ProductDto dto) {
        Product p = Product.builder()
                .brand(dto.getBrand())
                .category(dto.getCategory())
                .description(dto.getDescription())
                .id(dto.getId())
                .mrp(dto.getMrp())
                .name(dto.getName())
                .packageType(dto.getPackageType())
                .volume(dto.getVolume())
                .volumeType(dto.getVolumeType())
              .build();
        p.setImages(dto.getImages().stream().map(i-> dtoToImageEntity(i, p)).collect(Collectors.toList()));
        return p;
    }

    private ProductImage dtoToImageEntity(ProductImageDto dto, Product product) {
        return ProductImage.builder()
                .id(dto.getId())
                .image(dto.getImage())
                .product(product)
                .build();
    }


    private ProductDto entityToDto(Product entity) {
        return ProductDto.builder()
                .brand(entity.getBrand())
                .category(entity.getCategory())
                .description(entity.getDescription())
                .id(entity.getId())
                .mrp(entity.getMrp())
                .name(entity.getName())
                .packageType(entity.getPackageType())
                .volume(entity.getVolume())
                .volumeType(entity.getVolumeType())
                .images(entity.getImages().stream().map(i-> entityToImageDto(i, entity.getId())).collect(Collectors.toList()))
                .build();
    }

    private ProductImageDto entityToImageDto(ProductImage entity, Long productId) {
        return ProductImageDto.builder()
                .id(entity.getId())
                .productId(productId)
                .image(entity.getImage())
                .build();
    }
}

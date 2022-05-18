package com.kart.product.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto implements Serializable {
    private Long id;
    private String category;
    private String brand; // (SIDS/FARMMADE)
    private String name;
    private String packageType; // (POUCH/CUP/BOTTLE/BOX/NORMAL)
    private Double volume;
    private String volumeType; //( GMS/ML/L/Nos/KG)
    private String description;
    private Double mrp;
    private List<ProductImageDto> images;
}

package com.kart.product.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String brand; // (SIDS/FARMMADE)
    private String name;
    private String packageType; // (POUCH/CUP/BOTTLE/BOX/NORMAL)
    private Double volume;
    private String volumeType; //( GMS/ML/L/Nos/KG)
    private String description;
    private Double mrp;
    @OneToMany(mappedBy="product" ,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<ProductImage> images;
}

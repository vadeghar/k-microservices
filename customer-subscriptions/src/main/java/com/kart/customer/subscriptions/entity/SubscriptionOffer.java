package com.kart.customer.subscriptions.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscriptionOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long productId;
    private String desc;
    private Integer discount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private byte[] offerAdImage;
    private String status;

}

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
public class CustomerSubscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long customerId;
    private Long productId;
    private Long subscriptionOfferId;
    private Double price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime subscribedOn;

}

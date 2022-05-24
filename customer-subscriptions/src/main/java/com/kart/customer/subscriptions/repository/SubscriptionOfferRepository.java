package com.kart.customer.subscriptions.repository;

import com.kart.customer.subscriptions.entity.SubscriptionOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionOfferRepository extends JpaRepository<SubscriptionOffer, Long> {
}

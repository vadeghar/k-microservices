package com.kart.customer.subscriptions.repository;

import com.kart.customer.subscriptions.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}

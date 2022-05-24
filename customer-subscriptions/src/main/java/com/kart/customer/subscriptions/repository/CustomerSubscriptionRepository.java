package com.kart.customer.subscriptions.repository;

import com.kart.customer.subscriptions.entity.CustomerSubscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerSubscriptionRepository extends JpaRepository<CustomerSubscription, Long> {
}

package com.kart.customer.subscriptions.service;

import com.kart.customer.subscriptions.entity.Subscription;
import com.kart.customer.subscriptions.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {
    private final SubscriptionRepository subscriptionRepository;

    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    /**
     * Returns all Subscription
     * @return all
     */
    public List<Subscription> findAll() {
        return subscriptionRepository.findAll();
    }

    /**
     * Return Subscription by id
     * @param id to load
     * @return Subscription data
     */
    public Subscription findById(Long id) {
        return subscriptionRepository.getById(id);
    }

    /**
     * Returns saved Subscription
     * @param subscription to save
     * @return Subscription data
     */
    public Subscription save(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    /**
     * Delete Subscription
     * @param subscription to delete permanently
     */
    public void delete(Subscription subscription) {
        subscriptionRepository.delete(subscription);
    }
}

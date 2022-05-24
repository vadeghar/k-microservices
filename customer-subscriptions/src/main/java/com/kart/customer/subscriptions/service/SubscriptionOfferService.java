package com.kart.customer.subscriptions.service;

import com.kart.customer.subscriptions.entity.SubscriptionOffer;
import com.kart.customer.subscriptions.repository.SubscriptionOfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionOfferService {
    private final SubscriptionOfferRepository subscriptionOfferRepository;

    public SubscriptionOfferService(SubscriptionOfferRepository subscriptionOfferRepository) {
        this.subscriptionOfferRepository = subscriptionOfferRepository;
    }

    /**
     * Returns all SubscriptionOffer
     * @return SubscriptionOffer data
     */
    public List<SubscriptionOffer> findAll() {
        return subscriptionOfferRepository.findAll();
    }

    /**
     * Return SubscriptionOffer by id
     * @param id to load
     * @return SubscriptionOffer data
     */
    public SubscriptionOffer findById(Long id) {
        return subscriptionOfferRepository.getById(id);
    }

    /**
     * Returns saved SubscriptionOffer
     * @param subscriptionOffer to save
     * @return SubscriptionOffer data
     */
    public SubscriptionOffer save(SubscriptionOffer subscriptionOffer) {
        return subscriptionOfferRepository.save(subscriptionOffer);
    }

    /**
     * Delete SubscriptionOffer
     * @param subscriptionOffer to delete permanently
     */
    public void delete(SubscriptionOffer subscriptionOffer) {
        subscriptionOfferRepository.delete(subscriptionOffer);
    }
}

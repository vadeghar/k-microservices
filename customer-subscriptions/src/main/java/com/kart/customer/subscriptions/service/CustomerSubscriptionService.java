package com.kart.customer.subscriptions.service;


import com.kart.customer.subscriptions.entity.CustomerSubscription;
import com.kart.customer.subscriptions.repository.CustomerSubscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerSubscriptionService {
    private final CustomerSubscriptionRepository customerSubscriptionRepository;

    public CustomerSubscriptionService(CustomerSubscriptionRepository customerSubscriptionRepository) {
        this.customerSubscriptionRepository = customerSubscriptionRepository;
    }

    /**
     * Returns all CustomerSubscription
     * @return all CustomerSubscription
     */
    public List<CustomerSubscription> findAll() {
        return customerSubscriptionRepository.findAll();
    }

    /**
     * Return CustomerSubscription by id
     * @param id to load
     * @return CustomerSubscription data
     */
    public CustomerSubscription findById(Long id) {
        return customerSubscriptionRepository.getById(id);
    }

    /**
     * Returns saved CustomerSubscription
     * @param customerSubscription to save
     * @return saved CustomerSubscription data
     */
    public CustomerSubscription save(CustomerSubscription customerSubscription) {
        return customerSubscriptionRepository.save(customerSubscription);
    }

    /**
     * Delete CustomerSubscription
     * @param customerSubscription to delete permanently
     */
    public void delete(CustomerSubscription customerSubscription) {
        customerSubscriptionRepository.delete(customerSubscription);
    }
}

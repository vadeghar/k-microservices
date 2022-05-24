package com.kart.customer.subscriptions.controller;

import com.kart.customer.subscriptions.service.CustomerSubscriptionService;
import com.kart.customer.subscriptions.service.SubscriptionOfferService;
import com.kart.customer.subscriptions.service.SubscriptionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {
    private final CustomerSubscriptionService customerSubscriptionService;
    private final SubscriptionService subscriptionService;
    private final SubscriptionOfferService subscriptionOfferService;

    public SubscriptionController(CustomerSubscriptionService customerSubscriptionService, SubscriptionService subscriptionService, SubscriptionOfferService subscriptionOfferService) {
        this.customerSubscriptionService = customerSubscriptionService;
        this.subscriptionService = subscriptionService;
        this.subscriptionOfferService = subscriptionOfferService;
    }

    public String getAllCustomerSubscriptions() {

        return null;
    }

    public String getCustomerSubscriptionByCustomerId() {

        return null;
    }

    public String getCustomerSubscriptionBySubscriptionId() {

        return null;
    }

    public String getCustomerSubscriptionByOfferId() {

        return null;
    }

    public String getCustomerSubscriptionByProductId() {

        return null;
    }

    public String saveCustomerSubscription() {

        return null;
    }
}

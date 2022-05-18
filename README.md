# k-microservices

Implementing a Micro Service architecture with below features

1. Configuration Server for common propertis amonng different micro services
2. API Gateway - Entry point for all micro services
3. Eureka - Service discovery - whether the servic is up or down
4. Logging - Maintaing trace id and span id's among all micro services **TODO**
5. Hystrix - Implement circuit breaker **TODO**

6. Auth Server - Authentiaction for requests (Use OAtuh2.0, JWT)
7. Customer Service - Spring JPA
8. Product Service - Spring JPA
9. Customer Subscription - Uses Customer & Product Services (Use Feign Client) **TODO**

*** Docker container for above services

As of now all the above services will run using localhost (micro services, database-mysql)
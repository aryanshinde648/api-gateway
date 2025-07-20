package com.gateway.api_gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class GatewayConfig {
    

    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
        .route("payment-service",r -> r.path("/api/payments/**").uri("lb://PAYMENT-SERVICE"))
        .route("order-service", r -> r.path("/api/orders/**").uri("lb://ORDER-SERVICE"))
        .build();
    }
}

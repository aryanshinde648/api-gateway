package com.gateway.api_gateway.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gateway.api_gateway.dto.OrderResponse;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

    @PostMapping("/orderService")
    public OrderResponse OrderServiceFallback() {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOptionalOrder();
        return orderResponse;
    }

    @PostMapping("/paymentService")
    public String PaymentServiceFallback() {
        return "Payment service is unavailable. Please try again later.";
    }
}

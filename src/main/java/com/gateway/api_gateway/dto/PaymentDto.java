package com.gateway.api_gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {

    private Long paymentId;
    private String productId;
    private Double price;
    private String paymentStatus;
}

package com.gateway.api_gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    
    private Long orderId;
    private String productName;
    private int quantity;
    private Double price;
    private String status;
}

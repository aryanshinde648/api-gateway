package com.gateway.api_gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {

    private String orderId;
    private String productName;
    private int quantity;
    private Double price;
    private String status;

    private String productId;
    private Long paymentId;
    private String paymentStatus;

    public void setOptionalOrder() {
        setOrderId("1");
        setPrice(10000.0);
        setProductName("Samsung Galaxy S21");
        setProductId("456");
        setQuantity(1);
        setStatus("pending");
    }
}

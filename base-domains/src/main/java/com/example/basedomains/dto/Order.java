package com.example.basedomains.dto;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String orderId;
    private String name;
    private int quantity;
    private BigDecimal price;
}

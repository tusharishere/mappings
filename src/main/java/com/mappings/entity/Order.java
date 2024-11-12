package com.mappings.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long orderId;

    @Column(name = "order_date", nullable = false)
    private String orderDate;

    @Column(name = "amount", nullable = false)
    private String amount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
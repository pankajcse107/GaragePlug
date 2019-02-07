package com.example.demo.customer;

import javax.persistence.*;

@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Long customerId;
    private Long itemId;
    private int totalAmount;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    /*public Order()
    {
    }
    public Order(Long customer_id, Long item_id, Long orderId, int totalAmount) {
        this.customerId = customer_id;
        this.itemId = item_id;
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }*/


    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }




    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}

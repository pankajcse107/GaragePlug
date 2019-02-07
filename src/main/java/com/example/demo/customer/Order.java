package com.example.demo.customer;

import javax.persistence.*;

@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Long customerId;
    private Long itemId;
    private int total_amount;

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
    public Order(Long customer_id, Long item_id, Long orderId, int total_amount) {
        this.customerId = customer_id;
        this.itemId = item_id;
        this.orderId = orderId;
        this.total_amount = total_amount;
    }*/


    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }




    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }
}

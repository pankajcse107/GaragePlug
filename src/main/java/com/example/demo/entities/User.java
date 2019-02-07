package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int noOfOrders;
    private String customerStatus;


   /* public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }




    public Long getId()

    {
        return id;
    }

    public void setId(Long id)

    {
        this.id = id;
    }

    public String getName()

    {
        return name;
    }

    public void setName(String name
    )
    {
        this.name = name;
    }

    public int getPhone()

    {
        return phone;
    }

    public void setPhone(int phone)

    {
        this.phone = phone;
    }

    public String getEmail()

    {
        return email;
    }

    public void setEmail(String email)

    {
        this.email = email;
    }

    public int getNoOfOrders()
    {
        return noOfOrders;
    }

    public void setNoOfOrders(int noOfOrders)
    {
        this.noOfOrders = noOfOrders;


    }*/





}

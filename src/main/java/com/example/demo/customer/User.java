package com.example.demo.customer;

import javax.persistence.*;

@Entity
@Table(name ="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int no_of_orders;
    private String customer_Status ;


    public String getCustomer_Status() {
        return customer_Status;
    }

    public void setCustomer_Status(String customer_Status) {
        this.customer_Status = customer_Status;
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

    /*public int getPhone()

    {
        return phone;
    }

    public void setPhone(int phone)

    {
        this.phone = phone;
    }*/

    public String getEmail()

    {
        return email;
    }

    public void setEmail(String email)

    {
        this.email = email;
    }

    public int getNo_of_orders()
    {
        return no_of_orders;
    }

    public void setNo_of_orders(int no_of_orders)
    {
        this.no_of_orders = no_of_orders;


    }





}

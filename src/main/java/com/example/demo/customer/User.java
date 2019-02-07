package com.example.demo.customer;

import com.example.demo.controller.OrderController;

import javax.persistence.*;


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

    private Order order;
    @Enumerated(EnumType.STRING)
    private Catogory category;

    public Catogory getCategory() {
        return category;
    }

    public void setCategory(Catogory category) {
        this.category = category;
    }

    public void getCatogory()
    {
        if (noOfOrders >=10 && noOfOrders <=20  )
            System.out.println(Catogory.Gold);
        else if (noOfOrders >=20 && noOfOrders <30)
            System.out.println(Catogory.Platinum);
        else
            System.out.println(Catogory.Regular);
    }

    public String getCustomerStatus()
    {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus)
    {
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

    public int getNoOfOrders()
    {
        return noOfOrders;
    }

    public void setNoOfOrders(int noOfOrders)
    {
        this.noOfOrders = noOfOrders;


    }





}

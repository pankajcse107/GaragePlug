package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="Users")
public class User
{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;
    private int noOfOrders;
    private String customerStatus;

}

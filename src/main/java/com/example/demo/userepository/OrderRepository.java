package com.example.demo.userepository;

import com.example.demo.customer.Order;
import org.springframework.stereotype.Repository;


import org.springframework.data.repository.CrudRepository;
@Repository
public interface OrderRepository extends CrudRepository<Order,Long>
{

}

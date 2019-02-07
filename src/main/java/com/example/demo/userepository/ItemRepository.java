package com.example.demo.userepository;

import com.example.demo.customer.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item,Long>
{


}

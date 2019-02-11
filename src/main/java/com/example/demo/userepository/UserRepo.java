package com.example.demo.userepository;

import com.example.demo.entities.Order;
import com.example.demo.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {


     int countUserById(Long customerId);

    User findByNameAndId(String name, Long id);
}

package controller;


import customer.Customer;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import userepository.UserRepo;

import java.io.IOException;

@RestController
@RequestMapping("/customer")
public class Controller {
UserRepo userRepo;

@Autowired
public Controller(UserRepo userRepo)
{
    this.userRepo = userRepo;
}

@RequestMapping(method = RequestMethod.POST)
  public Customer createCostumer(@RequestBody Customer customer) throws IOException
 {
    return userRepo.save(customer);
 }


}

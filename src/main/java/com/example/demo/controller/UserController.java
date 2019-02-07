package com.example.demo.controller;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.example.demo.userepository.UserRepo;


@RestController
@RequestMapping("/customer1")
public class UserController {
    private UserRepo userRepo;
    private final UserService userService;

@Autowired
public UserController(UserRepo userRepo, UserService userService)
{
    this.userRepo = userRepo;
    this.userService = userService;
}

@PostMapping()
  public User createCostumer(@RequestBody User customer)
 {
    return userService.createUser(customer);
 }
 @RequestMapping(method = RequestMethod.GET)
    public  Iterable<User> get()
  {
        return userRepo.findAll();
  }
  @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public User getDetails(@PathVariable("id") Long id)
  {
      return userRepo.findById(id).get();
  }
  @RequestMapping(value = "na",method = RequestMethod.GET)
    public int getOrderNo(@RequestParam (value = "name") String name ,@RequestParam(value = "id") Long id)
  {
      return userRepo.findByNameAndId(name,id).getNoOfOrders();
  }
  @RequestMapping(value = "status",method = RequestMethod.GET)
          public String getStatus(@RequestParam (value = "name") String name,@RequestParam(value = "id") Long id)
  {
      return userRepo.findByNameAndId(name,id).getCustomerStatus();
  }

  @DeleteMapping("/delete")
  public void deleteAll()
  {
       userService.deleteAll();
  }




}

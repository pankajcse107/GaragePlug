package com.example.demo.controller;

import com.example.demo.customer.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.example.demo.userepository.UserRepo;


@RestController
@RequestMapping("/customer1")
public class UserController {

    private final UserService userService;

@Autowired
public UserController( UserService userService)
{

    this.userService = userService;
}

@PostMapping()
  public User createCostumer(@RequestBody User customer)

 {

    return userService.save(customer);

 }

 @GetMapping
    public  Iterable<User> get()
  {
        return userService.findAll();
  }
  @GetMapping ("/get")
    public User getDetails(@PathVariable("id") Long id)
  {
      return userService.findById(id);
  }


  @DeleteMapping("/delete")
  public void deleteAll()
  {
       userService.deleteAll();
  }





}

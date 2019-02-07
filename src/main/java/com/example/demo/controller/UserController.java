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
 @RequestMapping(method = RequestMethod.GET)
    public  Iterable<User> get()
  {
        return userService.findAll();
  }
  @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public User getDetails(@PathVariable("id") Long id)
  {
      return userService.findById(id);
  }
  /*@RequestMapping(value = "na",method = RequestMethod.GET)
    public int getOrderNo(@RequestParam (value = "name") String name ,@RequestParam(value = "id") Long id)
  {
      return userService.findByNameAndId(name,id).getNo_of_orders();
  }*/
  /*@RequestMapping(value = "status",method = RequestMethod.GET)
  public String getStatus(@RequestParam (value = "name") String name,@RequestParam(value = "id") Long id)
  {
      return userService.findByNameAndId(name,id).getCustomer_Status();
  }*/

  @DeleteMapping("/delete")
  public void deleteAll()
  {
       userService.deleteAll();
  }




}

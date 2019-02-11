package com.example.demo.service;

import com.example.demo.entities.Category;
import com.example.demo.entities.Order;
import com.example.demo.entities.User;
import com.example.demo.userepository.OrderRepository;
import com.example.demo.userepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderService {
    private OrderRepository orderRepository;
     private UserService userService;
     private Category category;



     @Autowired
     public OrderService(OrderRepository orderRepository,UserService userService)
     {
        this.orderRepository = orderRepository;
        this.userService = userService;
     }
   /* public void incrimentOrderCount(User user)
     {
          int i = user.getNoOfOrders();
          user.setNoOfOrders(i+1);

     }*/
     public Order createOrder( Order order)
     {
          orderRepository.save(order);
          User user = userService.findUser(order.getCustomerId());
          updatePrice(order,user);
        //  incrimentOrderCount(user);
          userService.updateCategory(user);


          return order;
     }
     public void sendPromo(int noOfOrder)
     {
          if( noOfOrder == 9)
          {
               System.out.println("");
          }


     }
     public void updatePrice(Order order,User user)
     {
          int price = order.getTotalAmount();
          if(user.getCustomerStatus() == "Gold" )
          {
                price  = (int) (order.getTotalAmount()*0.1);
          }
          else if (user.getCustomerStatus()=="Platinum")
          {
               price = (int)(order.getTotalAmount()*0.2);
          }

          order.setNetAmount(price);
         ;
         orderRepository.save(order);
     }

}

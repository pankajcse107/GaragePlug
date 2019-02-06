package customer;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name ="Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int phone;
    private String email;
    private int no_of_orders;
    private String customer_Status ;

    public String getCustomer_Status() {
        return customer_Status;
    }

    public void setCustomer_Status(String customer_Status) {
        this.customer_Status = customer_Status;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNo_of_orders() {
        return no_of_orders;
    }

    public void setNo_of_orders(int no_of_orders) {
        this.no_of_orders = no_of_orders;
        if(no_of_orders == 10)
        {

        }

    }





}

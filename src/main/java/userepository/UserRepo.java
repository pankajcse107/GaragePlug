package userepository;

import customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Customer,Integer> {
}

package service.custom;

import dto.Customer;

import java.util.List;

public interface CustomerService {

    boolean addCustomer(Customer customer);

    boolean updateCustomer(String id, Customer customer);

    boolean deleteCustomer(String id);

    Customer searchCustomer(String id);

    List<Customer> getAll();
}

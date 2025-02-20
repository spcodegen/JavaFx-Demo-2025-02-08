package service.custom.impl;

import com.google.inject.Inject;
import dto.Customer;
import entity.CustomerEntity;
import org.modelmapper.ModelMapper;
import repository.custom.CustomerDao;
import service.custom.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Inject
    CustomerDao dao;

    @Override
    public boolean addCustomer(Customer customer) {
        System.out.println("Service : " + customer);

//      Customer object mapping CustomerEntity

//      CustomerEntity customerEntity = new CustomerEntity();
//      customerEntity.setId(customer.getId());
//      customerEntity.setName(customer.getName());
//      customerEntity.setAddress(customer.getAddress());
//      customerEntity.setSalary(customer.getSalary());

//      Using ModelMapper Dependency
        CustomerEntity map = new ModelMapper().map(customer, CustomerEntity.class);

        dao.save(map);
        return false;
    }

    @Override
    public boolean updateCustomer(String id, Customer customer) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }

    @Override
    public Customer searchCustomer(String id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }
}

package repository.custom;

import dto.Customer;
import repository.CrudRepository;
import repository.SuperDao;

public interface CustomerDao extends CrudRepository<Customer, String> {
}

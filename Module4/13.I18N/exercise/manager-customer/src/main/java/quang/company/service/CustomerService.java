package quang.company.service;

import quang.company.model.Customer;

import java.util.List;

public interface CustomerService  {
    public List<Customer> findAll();
    public void save(Customer customer);
    public Customer findById(Long id);
    public void delete(Long id);
}

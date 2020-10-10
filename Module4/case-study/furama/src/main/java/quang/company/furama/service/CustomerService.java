package quang.company.furama.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import quang.company.furama.model.Customer;


import java.util.List;

public interface CustomerService {
    public Page<Customer> findAll(Pageable pageable);
    public List<Customer> findAll();
    public Customer findById(long id);
    public void save(Customer customer);
    public void deleteById(long id);
    public void deleteAllByIdCustomerIn(List<Long> list);
}

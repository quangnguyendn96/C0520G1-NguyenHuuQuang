package quang.company.furama.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import quang.company.furama.model.Customer;


import java.util.List;

public interface CustomerService {
    public Page<Customer> findAll(Pageable pageable);
    public List<Customer> findAll();
    List<Customer> findAllByStatusTrue();
    public Customer findById(String id);
    public void save(Customer customer);
//    public void deleteById(String id);
    public void deleteByIdTrue(String id);
    public void deleteAllByIdIn(List<String> list);
}

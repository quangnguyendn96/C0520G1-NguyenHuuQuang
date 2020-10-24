package quang.company.furama.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import quang.company.furama.model.Customer;
import quang.company.furama.repository.CustomerRepository;
import quang.company.furama.service.CustomerService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    public Page<Customer> findAllByTrue(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


    @Override
    public List<Customer> findAllByStatusTrue() {
        return customerRepository.findAllByStatusTrue();
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customer.setStatus(true);
        customerRepository.save(customer);
    }

    @Override
    public void deleteByIdTrue(String id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        customer.setStatus(false);

        customerRepository.save(customer);
    }

    @Override
    public void deleteAllByIdIn(List<String> list) {
        customerRepository.deleteAllByIdCustomerIn(list);
    }
}

package quang.company.furama.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.furama.model.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
    void deleteAllByIdCustomerIn(List<String> list);
    List<Customer> findAllByStatusTrue();

}

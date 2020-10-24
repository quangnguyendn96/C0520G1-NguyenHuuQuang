package quang.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

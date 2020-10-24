package quang.company.furama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.furama.model.TypeCustomer;

@Repository
public interface TypeCustomerRepository extends JpaRepository<TypeCustomer,Long> {
}

package quang.company.furama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.furama.model.Contract;


public interface ContractRepository extends JpaRepository<Contract,Long> {
}

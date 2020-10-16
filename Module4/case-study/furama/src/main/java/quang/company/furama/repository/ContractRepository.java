package quang.company.furama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.furama.model.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract,String> {
}

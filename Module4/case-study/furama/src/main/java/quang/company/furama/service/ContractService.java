package quang.company.furama.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import quang.company.furama.model.Contract;

import java.util.List;

public interface ContractService {
    public Page<Contract> findAll(Pageable pageable);
    public List<Contract> findAll();
    public Contract findById(String id);
    public void save(Contract contract);
    public void deleteById(String id);
    public void deleteAllByIdIn(List<String> list);
}

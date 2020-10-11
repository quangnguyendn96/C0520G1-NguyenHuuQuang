package quang.company.furama.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.furama.model.TypeCustomer;
import quang.company.furama.repository.TypeCustomerRepository;
import quang.company.furama.service.TypeCustomerService;

import java.util.List;

@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {
    @Autowired
    private TypeCustomerRepository typeCustomerRepository;
    @Override
    public List<TypeCustomer> findAll() {
        return typeCustomerRepository.findAll();
    }
}

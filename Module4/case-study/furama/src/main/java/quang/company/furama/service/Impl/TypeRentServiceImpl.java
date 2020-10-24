package quang.company.furama.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.furama.model.TypeCustomer;
import quang.company.furama.model.TypeRent;
import quang.company.furama.repository.TypeCustomerRepository;
import quang.company.furama.repository.TypeRentRepository;
import quang.company.furama.service.TypeCustomerService;
import quang.company.furama.service.TypeRentService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TypeRentServiceImpl implements TypeRentService {
    @Autowired
    private TypeRentRepository typeRentRepository;
    @Override
    public List<TypeRent> findAll() {
        return typeRentRepository.findAll();
    }
}

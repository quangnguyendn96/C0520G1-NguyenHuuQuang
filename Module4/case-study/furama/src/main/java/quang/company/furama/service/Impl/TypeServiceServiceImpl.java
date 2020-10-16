package quang.company.furama.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.furama.model.TypeRent;
import quang.company.furama.model.TypeService;
import quang.company.furama.repository.TypeRentRepository;
import quang.company.furama.repository.TypeServiceRepository;
import quang.company.furama.service.TypeRentService;
import quang.company.furama.service.TypeServiceService;

import java.util.List;

@Service
public class TypeServiceServiceImpl implements TypeServiceService {
    @Autowired
    private TypeServiceRepository typeServiceRepository;
    @Override
    public List<TypeService> findAll() {
        return typeServiceRepository.findAll();
    }
}

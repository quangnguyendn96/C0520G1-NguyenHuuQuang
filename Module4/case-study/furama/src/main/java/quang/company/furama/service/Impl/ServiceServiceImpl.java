package quang.company.furama.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

//import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;
import quang.company.furama.repository.ServiceRepository;
import quang.company.furama.model.Services;
import quang.company.furama.service.ServiceService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public Page<Services> findAll(Pageable pageable) {
         return serviceRepository.findAll(pageable);
    }

    @Override
    public List<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Services findById(long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Services services) {
        serviceRepository.save(services);
    }

    @Override
    public void deleteById(long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public void deleteAllByIdIn(List<Long> list) {

    }
}

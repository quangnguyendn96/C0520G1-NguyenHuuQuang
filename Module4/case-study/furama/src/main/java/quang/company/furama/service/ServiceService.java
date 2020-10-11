package quang.company.furama.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import quang.company.furama.model.Contract;
import quang.company.furama.model.Services;

import java.util.List;

public interface ServiceService {
    public Page<Services> findAll(Pageable pageable);
    public List<Services> findAll();
    public Services findById(long id);
    public void save(Services services);
    public void deleteById(long id);
    public void deleteAllByIdIn(List<Long> list);
}

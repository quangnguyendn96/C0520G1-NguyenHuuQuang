package quang.company.cartsession.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.cartsession.model.CdProduct;
import quang.company.cartsession.repository.CdProductRepository;


import java.util.List;

@Service
public class CdProductServiceImpl implements CdProductService {
    @Autowired
    CdProductRepository cdProductRepository;


    @Override
    public List<CdProduct> findAll() {
        return cdProductRepository.findAll();
    }

    @Override
    public CdProduct findById(Long id) {
        return cdProductRepository.findById(id).orElse(null);
    }

    @Override
    public void save(CdProduct product) {
        cdProductRepository.save(product);
    }
}

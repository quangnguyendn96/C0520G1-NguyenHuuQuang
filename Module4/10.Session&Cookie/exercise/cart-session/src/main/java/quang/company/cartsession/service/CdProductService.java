package quang.company.cartsession.service;

import quang.company.cartsession.model.CdProduct;


import java.util.List;

public interface CdProductService {
    List<CdProduct> findAll();

    CdProduct findById(Long id);

    void save(CdProduct product);

}

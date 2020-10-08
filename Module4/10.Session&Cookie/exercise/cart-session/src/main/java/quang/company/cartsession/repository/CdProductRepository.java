package quang.company.cartsession.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.cartsession.model.CdProduct;

import java.util.List;

@Repository
public interface CdProductRepository extends JpaRepository<CdProduct,Long> {


    }


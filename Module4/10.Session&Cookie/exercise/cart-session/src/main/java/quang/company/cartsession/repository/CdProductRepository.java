package quang.company.cartsession.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.cartsession.model.CdProduct;


public interface CdProductRepository extends JpaRepository<CdProduct,Long> {
}

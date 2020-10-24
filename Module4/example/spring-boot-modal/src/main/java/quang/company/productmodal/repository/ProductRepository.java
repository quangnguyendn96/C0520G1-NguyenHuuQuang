package quang.company.productmodal.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.productmodal.model.Product;

import javax.validation.constraints.Min;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
//    void deleteAllByIdProductIn(List<Long> list);
    Page<Product> findProductByCategory_IdCategoryAndNameProductContaining(int category, String name, Pageable pageable);

    Page<Product> findAllByStatusProductTrue(Pageable pageable);
    Page<Product> findAllByNameProductContaining(String name,Pageable pageable);
    Page<Product> findAllByDateImportContaining(String name,Pageable pageable);
    Page<Product> findAllByDateExportContaining(String name,Pageable pageable);
    Page<Product> findAllByIdProductContaining(String name,Pageable pageable);
    Page<Product> findAllByPriceProductContaining(double priceProduct, Pageable pageable);
    Page<Product> findAllByCategoryContaining(String name,Pageable pageable);
    Page<Product> findAllByNameProductOrDateExportOrDateImportContaining(String search,String search1,String search2, Pageable pageable);
}

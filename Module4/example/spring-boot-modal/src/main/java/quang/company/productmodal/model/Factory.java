//package quang.company.productmodal.model;
//
//import org.springframework.web.bind.annotation.GetMapping;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table
//
//public class Factory {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    int idFactory;
//    String nameFactory;
//
//    @ManyToMany(mappedBy = "factories")
//    private Set<Product> products;
//
//    public Factory() {
//    }
//
//    public int getIdFactory() {
//        return idFactory;
//    }
//
//    public void setIdFactory(int idFactory) {
//        this.idFactory = idFactory;
//    }
//
//    public String getNameFactory() {
//        return nameFactory;
//    }
//
//    public void setNameFactory(String nameFactory) {
//        this.nameFactory = nameFactory;
//    }
//}

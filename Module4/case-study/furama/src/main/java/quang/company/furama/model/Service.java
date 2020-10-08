package quang.company.furama.model;

        import lombok.Data;

        import javax.persistence.*;
        import java.util.Collection;

@Entity
@Table
@Data
public class Service {
    @Id
    private long idService;
    private String  nameService;
    private double areaService   ;
    private String numberFloor;
    private String maximumCustomer;
    private double costRent;
    private String  descriptionOtherConvenience;
    private double poolArea;
    private String standardRoom;

    @ManyToOne()
    @JoinColumn(name = "idTypeRent")
    TypeRent typeRent;

    @ManyToOne()
    @JoinColumn(name = "idTypeService")
    TypeService typeService;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    Collection<Contract> contracts;
}

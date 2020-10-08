package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class TypeService {
    @Id
    private long idTypeService;
    private String nameTypeService;

    @OneToMany(mappedBy = "typeService", cascade = CascadeType.ALL)
    Collection<Service> services;
}

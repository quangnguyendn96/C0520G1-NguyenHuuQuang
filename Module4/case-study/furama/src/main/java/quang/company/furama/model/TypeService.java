package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table

public class TypeService {
    @Id
    private long idTypeService;
    private String nameTypeService;

    @OneToMany(mappedBy = "typeService", cascade = CascadeType.ALL)
    Collection<Services> services;

    public TypeService() {
    }

    public long getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(long idTypeService) {
        this.idTypeService = idTypeService;
    }

    public String getNameTypeService() {
        return nameTypeService;
    }

    public void setNameTypeService(String nameTypeService) {
        this.nameTypeService = nameTypeService;
    }

    public Collection<Services> getServices() {
        return services;
    }

    public void setServices(Collection<Services> services) {
        this.services = services;
    }
}

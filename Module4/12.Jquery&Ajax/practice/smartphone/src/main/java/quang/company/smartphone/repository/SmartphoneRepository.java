package quang.company.smartphone.repository;

import quang.company.smartphone.model.Smartphone;
import org.springframework.data.repository.CrudRepository;

public interface SmartphoneRepository extends CrudRepository<Smartphone, Integer> {
}

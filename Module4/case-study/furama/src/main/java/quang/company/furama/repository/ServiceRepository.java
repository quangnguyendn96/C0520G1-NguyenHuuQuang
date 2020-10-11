package quang.company.furama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.furama.model.Services;

public interface ServiceRepository extends JpaRepository<Services,Long> {
}

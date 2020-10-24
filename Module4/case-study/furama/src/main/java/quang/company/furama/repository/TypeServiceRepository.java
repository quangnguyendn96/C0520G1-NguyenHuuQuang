package quang.company.furama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quang.company.furama.model.TypeService;

@Repository
public interface TypeServiceRepository extends JpaRepository<TypeService,Long> {
}

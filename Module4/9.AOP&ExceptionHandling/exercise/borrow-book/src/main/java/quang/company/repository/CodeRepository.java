package quang.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.model.Code;

public interface CodeRepository extends JpaRepository<Code,Integer> {
}

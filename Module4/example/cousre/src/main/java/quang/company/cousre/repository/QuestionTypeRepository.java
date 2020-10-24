package quang.company.cousre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.cousre.model.QuestionType;

@Repository
public interface QuestionTypeRepository extends JpaRepository<QuestionType,Long> {
}

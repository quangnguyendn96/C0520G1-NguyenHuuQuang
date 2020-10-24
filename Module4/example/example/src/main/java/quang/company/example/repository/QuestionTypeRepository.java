package quang.company.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import quang.company.example.model.QuestionType;

import java.util.List;
@Repository
public interface QuestionTypeRepository extends JpaRepository<QuestionType,Long> {
}

package quang.company.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quang.company.example.model.Question;


@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {

}

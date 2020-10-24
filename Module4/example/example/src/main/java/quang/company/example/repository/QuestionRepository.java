package quang.company.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quang.company.example.model.Question;

import java.util.List;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findAllByStatusOrTitleOrDateCreateOrUserFeedbackContaining(String name, String name1,String name3, String name4);

    List<Question> findAllByTitleContaining(String name);
}

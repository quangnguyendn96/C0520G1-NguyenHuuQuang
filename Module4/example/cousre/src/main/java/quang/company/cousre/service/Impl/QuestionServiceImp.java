package quang.company.cousre.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.cousre.model.Question;
import quang.company.cousre.repository.QuestionRepository;
import quang.company.cousre.service.QuestionService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class QuestionServiceImp implements QuestionService {

@Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> findAllField(String name) {
        return questionRepository.findAllByStatusOrTitleOrDateCreateOrUserFeedbackContaining(name,name,name,name);
    }

    @Override
    public List<Question> findAllSelect(String name) {
        return questionRepository.findAllByTitleContaining(name);
    }

    @Override
    public Question findById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);

    }

    @Override
    public void deleteById(Long id) {
        questionRepository.deleteById(id);
    }
}

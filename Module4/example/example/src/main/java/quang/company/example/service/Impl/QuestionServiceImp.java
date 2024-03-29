package quang.company.example.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import quang.company.example.model.Question;
import quang.company.example.repository.QuestionRepository;
import quang.company.example.service.QuestionService;


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

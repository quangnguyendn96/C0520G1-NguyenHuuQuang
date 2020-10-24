package quang.company.example.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import quang.company.example.model.Question;
import quang.company.example.model.QuestionType;
import quang.company.example.repository.QuestionRepository;
import quang.company.example.repository.QuestionTypeRepository;
import quang.company.example.service.QuestionService;
import quang.company.example.service.QuestionTypeService;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class QuestionTypeServiceImpl implements QuestionTypeService {

    @Autowired
    QuestionTypeRepository questionTypeRepository;


    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }
}

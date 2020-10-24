package quang.company.cousre.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.cousre.model.QuestionType;
import quang.company.cousre.repository.QuestionTypeRepository;
import quang.company.cousre.service.QuestionTypeService;

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

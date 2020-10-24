package quang.company.cousre.service;

import quang.company.cousre.model.Question;

import java.util.List;


public interface QuestionService {


    List<Question> findAll();
    List<Question> findAllField(String name);
    List<Question> findAllSelect(String name);



    public Question findById(Long id);

    public void save(Question question);

    public void deleteById(Long id);


}

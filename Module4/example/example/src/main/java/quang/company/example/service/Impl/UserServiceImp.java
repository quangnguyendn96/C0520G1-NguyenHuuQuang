package quang.company.example.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.example.model.Question;
import quang.company.example.model.User;
import quang.company.example.repository.QuestionRepository;
import quang.company.example.repository.UserRepository;
import quang.company.example.service.QuestionService;
import quang.company.example.service.UserService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository questionRepository;


    @Override
    public List<User> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {

        questionRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        questionRepository.deleteById(id);
    }
}

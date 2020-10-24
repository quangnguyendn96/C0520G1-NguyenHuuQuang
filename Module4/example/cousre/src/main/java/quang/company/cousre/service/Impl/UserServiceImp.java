package quang.company.cousre.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.cousre.model.User;
import quang.company.cousre.repository.UserRepository;
import quang.company.cousre.service.UserService;

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

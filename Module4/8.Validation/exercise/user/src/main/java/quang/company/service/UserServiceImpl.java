package quang.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quang.company.model.User;
import quang.company.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
class UserServiceImpl implements UserService {
    @Autowired
  private UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return null;
    }
}

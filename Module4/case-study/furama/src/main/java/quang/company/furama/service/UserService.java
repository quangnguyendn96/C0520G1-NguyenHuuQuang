package quang.company.furama.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import quang.company.furama.model.Contract;
import quang.company.furama.model.User;

import java.util.List;

public interface UserService {
    public Page<User> findAll(Pageable pageable);
    public List<User> findAll();
    public User findById(String id);
    public void save(User contract);
    public void deleteById(String id);
    public void deleteAllByIdIn(List<String> list);
}

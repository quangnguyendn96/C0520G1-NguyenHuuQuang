package quang.company.cousre.service;

import quang.company.cousre.model.User;

import java.util.List;


public interface UserService {


    List<User> findAll();
    public User findById(Long id);

    public void save(User user);

    public void deleteById(Long id);


}

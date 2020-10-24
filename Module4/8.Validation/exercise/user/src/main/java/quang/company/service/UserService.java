package quang.company.service;


import quang.company.model.User;

import java.util.List;

public interface UserService {
     List<User> findAll();

    User save(User blog);

    User findById(Long id);
}

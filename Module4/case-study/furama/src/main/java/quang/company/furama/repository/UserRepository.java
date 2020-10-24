package quang.company.furama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.furama.model.Contract;
import quang.company.furama.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String user);
}

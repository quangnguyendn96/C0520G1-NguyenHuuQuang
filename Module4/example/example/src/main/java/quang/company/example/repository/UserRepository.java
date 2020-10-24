package quang.company.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.example.model.Question;
import quang.company.example.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

package quang.company.cousre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quang.company.cousre.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

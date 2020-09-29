package quang.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quang.company.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


}

package quang.company.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.blog.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUserName(String accountName);
}

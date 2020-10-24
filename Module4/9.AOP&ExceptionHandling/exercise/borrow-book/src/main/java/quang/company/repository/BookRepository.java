package quang.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quang.company.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>  {
}

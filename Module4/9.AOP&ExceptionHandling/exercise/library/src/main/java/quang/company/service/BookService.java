package quang.company.service;

import quang.company.model.Book;

import java.util.List;

public interface BookService {
    public List<Book> findAll();

    public Book save(Book book);

    public Book findById(Integer id);

}

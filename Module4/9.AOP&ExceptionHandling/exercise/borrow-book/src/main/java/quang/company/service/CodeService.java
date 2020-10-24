package quang.company.service;

import quang.company.model.Book;
import quang.company.model.Code;

import java.util.List;

public interface CodeService {
    public List<Code> findAll();

    public Code save(Code code);

    public Code findById(Integer id);

    void deleteById(Integer id);
    public Code findByCodeBook(int code);
}

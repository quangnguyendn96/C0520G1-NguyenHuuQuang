package quang.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quang.company.model.Book;
import quang.company.model.Code;
import quang.company.repository.BookRepository;
import quang.company.repository.CodeRepository;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService {
    @Autowired
    private CodeRepository codeRepository;

    @Override
    public List<Code> findAll() {
        return codeRepository.findAll();
    }

    @Override
    public Code save(Code code) {
        return codeRepository.save(code);
    }

    @Override
    public Code findById(Integer id) {
        return codeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        codeRepository.deleteById(id);
    }

    @Override
    public Code findByCodeBook(int code) {
        return codeRepository.findByCodeBook(code);
    }
}

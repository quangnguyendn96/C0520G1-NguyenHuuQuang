package bo.iml;

import bo.DictionaryBO;
import dao.DictionaryDAO;
import org.springframework.stereotype.Service;


public class DictionaryIml implements DictionaryBO {
    DictionaryDAO dictionaryDAO = new DictionaryDAO();
    public String searchWord(String word) {
        return dictionaryDAO.searchWord(word);
    }

}

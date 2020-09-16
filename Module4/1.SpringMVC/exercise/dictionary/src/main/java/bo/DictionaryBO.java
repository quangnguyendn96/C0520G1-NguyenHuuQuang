package bo;

import dao.DictionaryDAO;

public class DictionaryBO {
    DictionaryDAO dictionaryDAO = new DictionaryDAO();

    public String searchWord(String word) {
        return dictionaryDAO.searchWord(word);
    }
}

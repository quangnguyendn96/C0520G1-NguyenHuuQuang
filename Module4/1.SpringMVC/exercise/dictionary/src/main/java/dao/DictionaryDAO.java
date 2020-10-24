package dao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DictionaryDAO {
    public DictionaryDAO() {
    }

    public List<String> listEn() {
        List<String> listEn = new ArrayList<>();
        listEn.add("handsome");
        listEn.add("beautiful");
        listEn.add("home");
        listEn.add("book");
        listEn.add("table");
        listEn.add("teacher");
        listEn.add("university");
        listEn.add("chuong");
        listEn.add("quang");
        listEn.add("Yen Nhi");
        listEn.add("Thuy Trang");
        return listEn;
    }

    public List<String> listVn() {
        List<String> listVn = new ArrayList<>();
        listVn.add("dep trai");
        listVn.add("xinh đẹp");
        listVn.add("ngôi nhà");
        listVn.add("cuốn sách");
        listVn.add("cái bàn");
        listVn.add("giáo viên");
        listVn.add("truong dai hoc");
        listVn.add("đẹp gái");
        listVn.add("hot boy");
        listVn.add("thiếp 1");
        listVn.add("thiếp 2");
        return listVn;
    }

    public String searchWord(String word) {
        int index = -1;
        for (int i = 0; i < listEn().size(); i++) {
            if (word.equals(listEn().get(i))) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return "not found";
        } else
            return listVn().get(index);
    }
}

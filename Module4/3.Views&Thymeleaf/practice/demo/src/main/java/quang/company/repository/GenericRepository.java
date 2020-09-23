package quang.company.repository;

import java.util.List;

public interface GenericRepository<T> {
    List<T> showAll();
    T findByName(int id);
    void update(int id, T t);
    void save(T t);
    List<T> search(String string);
    void remove(int id);
}

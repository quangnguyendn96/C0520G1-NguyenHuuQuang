package respositive;

import java.util.List;
import java.util.Map;

public interface GenericRepository<T> {
    List<T> showAll();
    T findByName(int id);
    void update(int id, T t);
    void save(T t);
    List<T> search(String string);
    void remove(int id);
}

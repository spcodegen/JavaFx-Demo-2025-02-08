package repository;

import java.util.List;

public interface CrudRepository<T, ID> {

    boolean save(T entity);

    boolean update(ID id, T entity);

    boolean delete(ID id);

    T search(ID id);

    List<T> getAll();
}

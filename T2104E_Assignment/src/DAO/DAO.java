package DAO;

import Data.Category;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

    List<T> getAll();

    void add(T t);

    void update(T t);

    void delete(T t);

    void show(T t);

}

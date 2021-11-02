package DAO;

import Data.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class CategoryDAO implements DAO<Category>{

    private List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> getAll() {
        return categories;
    }

    @Override
    public void add(Category category) {
        categories.add(category);
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public void show(Category category) {

    }
}

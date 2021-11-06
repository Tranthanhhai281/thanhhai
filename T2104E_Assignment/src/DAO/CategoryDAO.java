package DAO;

import Data.Category;
import Data.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryDAO extends Category{

    private List<Category> categories = new ArrayList<>();

    public CategoryDAO(List<Category> categories) {
        this.categories = categories;
    }

    public CategoryDAO() {
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void add(Category category) {
        if (category != null) {
            this.categories.add(category);
        }
    }

    public int search(String idCate) {
        if(idCate == null || idCate.length() == 0){
            return -1;
        }
        for (int i = 0; i < this.categories.size(); i++){
            Category cate = this.categories.get(i);
            if (cate != null){
                if (idCate.equals(cate.getIdCate())){
                    return i;
                }
            }
        }
        return -1;
    }

    public int update(String idCate) {
        if (idCate == null || idCate.length() == 0){
            return -1;
        }

        int index = this.search(idCate);
        if (index == -1){
            return 0;
        }
        Category cate = this.categories.get(index);
        System.out.println("Nhap lai thong tin Category: ");
        cate.nhap();
        if(this.categories.set(index,cate) != null){
            return 1;
        }
        return 2;
    }

    public void delete() {

    }

    public void show() {
        for(Category c : this.categories) {
            if (c != null) {
                System.out.println(c.toString());
            }
        }
    }

}

package DAO;

import Data.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends Product{

    private List<Product> products = new ArrayList<>();

    public ProductDAO(List<Product> products) {
        this.products = products;
    }

    public ProductDAO() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        if (product != null) {
            this.products.add(product);
        }
    }

    public int search(String idPro) {
        if(idPro == null || idPro.length() == 0){
            return -1;
        }
        for (int i = 0; i < this.products.size(); i++){
            Product pro = this.products.get(i);
            if (pro != null){
                if (idPro.equals(pro.getIdPro())){
                    return i;
                }
            }
        }
        return -1;
    }

    public int update(String idPro) {
        if (idPro == null || idPro.length() == 0){
            return -1;
        }
        int index = this.search(idPro);
        if (index == -1){
            return 0;
        }
        Product pro = this.products.get(index);
        System.out.println("Nhap lai thong tin Product: ");
        pro.nhap();
        if(this.products.set(index,pro) != null){
            return 1;
        }
        return 2;
    }

    public void delete() {

    }

    public void show() {
        for(Product p : this.products) {
            if (p != null) {
                System.out.println(p.toString());
            }
        }
    }
}

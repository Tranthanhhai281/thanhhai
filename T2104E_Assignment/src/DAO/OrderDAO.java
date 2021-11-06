package DAO;

import Data.Order;
import Data.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderDAO extends Order {

    private List<Order> orders = new ArrayList<>();

    public OrderDAO() {
    }

    public OrderDAO(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void add(Order order) {
        if (order != null) {
            this.orders.add(order);
        }
    }

    public void search() {

    }

    public void update() {

    }

    public void delete() {

    }

    public void show() {
        for(Order o : this.orders) {
            if (o != null) {
                System.out.println(o.toString());
            }
        }
    }
}

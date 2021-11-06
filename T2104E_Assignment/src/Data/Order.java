package Data;

import DAO.IOperation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Order implements IOperation {
    private String customer;
    private ArrayList<Product> dsProduct;
    private Date purchasedate;
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM//yyyy");

    public Order() {
    }

    public Order(String customer, ArrayList<Product> dsProduct, Date purchasedate) {
        this.customer = customer;
        this.dsProduct = dsProduct;
        this.purchasedate = purchasedate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getDsProduct() {
        return dsProduct;
    }

    public void setDsProduct(ArrayList<Product> dsProduct) {
        this.dsProduct = dsProduct;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Nhap TT Oder---");
        System.out.println("Nhap ten khach hang: ");
        this.customer = sc.nextLine();
        while (this.purchasedate == null) {
            System.out.println("Ngay mua hang (dd/MM/yyyy): ");
            try {
                this.purchasedate = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                System.out.println("Nhap khong hop le.");
            }
        }
    }

    @Override
    public void xuat() {
        System.out.println("Ten khach hang:" + this.customer +
                "; ngay mua hang:" + this.purchasedate + "; danh sch mua:" + this.dsProduct);
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer='" + customer + '\'' +
                ", dsProduct=" + dsProduct +
                ", purchasedate=" + purchasedate +
                ", sdf=" + sdf +
                '}';
    }
}

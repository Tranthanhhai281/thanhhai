package Data;

import DAO.IOperation;

import java.util.Scanner;

public class Category implements IOperation {
    private String IdCate;
    private String NameCate;
    private float vat;

    public Category() {
    }

    public Category(String idCate, String nameCate, float vat) {
        IdCate = idCate;
        NameCate = nameCate;
        this.vat = vat;
    }

    public String getIdCate() {
        return IdCate;
    }

    public void setIdCate(String idCate) {
        IdCate = idCate;
    }

    public String getNameCate() {
        return NameCate;
    }

    public void setNameCate(String nameCate) {
        NameCate = nameCate;
    }

    public float getVat() {
        return vat;
    }

    public void setVat(float vat) {
        this.vat = vat;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Nhap TT Category----");
        while (true) {
            System.out.println("Nhap ma Category: ");
            String IdCate = sc.nextLine();
            if (IdCate.length() != 4) {
                System.out.println("Ma nhom hang phai 4 ky tu.");
            } else if (IdCate.replaceAll(" ", "").length() != IdCate.length()) {
                System.out.println("Ma nhom hang khong duoc co khoang trang.");
            }else {
                this.IdCate =IdCate;
            }
            if (this.IdCate != null) {
                break;
            }
        }
        System.out.println("Nhap ten nhom hang: ");
        this.NameCate = sc.nextLine();
        while (true) {
            System.out.println("Nhap vat: ");
            float vat = sc.nextFloat();
            if (vat <= 0){
                System.out.println("Khong hop le moi nhap lai.");
            }else if (vat >= 1){
                System.out.println("Khong hop le moi nhap lai.");
            }else {
                this.vat = vat;
            }
            break;
        }
    }

    @Override
    public void xuat() {
        System.out.println("Ma Nhom Hang: "+ this.IdCate + "; Ten nhom hang : "+ this.NameCate +
                "; vat: " + this.vat);
    }
}

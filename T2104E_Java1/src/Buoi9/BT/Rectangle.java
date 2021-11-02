package Buoi9.BT;

import java.util.Scanner;

public class Rectangle implements IShape, IContentShape{
    private int canhNgang;
    private int canhDoc;

    public Rectangle() {
    }

    public Rectangle(int canhNgang, int canhDoc) {
        this.canhNgang = canhNgang;
        this.canhDoc = canhDoc;
    }

    public int getCanhNgang() {
        return canhNgang;
    }

    public void setCanhNgang(int canhNgang) {
        this.canhNgang = canhNgang;
    }

    public int getCanhDoc() {
        return canhDoc;
    }

    public void setCanhDoc(int canhDoc) {
        this.canhDoc = canhDoc;
    }

    @Override
    public void descript() {
        System.out.println("Nhap thong tin hinh chu nhat: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh ngang: ");
        this.canhNgang = sc.nextInt();
        System.out.println("Nhap canh doc: ");
        this.canhDoc = sc.nextInt();
    }

    @Override
    public void area() {
        int S;
        S = this.canhNgang * this.canhDoc;
        System.out.println("Dien tich hinh chu nhat: " + S);
    }

    @Override
    public void perimeter() {
        int P;
        P = (this.canhNgang + this.canhDoc) * 2;
        System.out.println("Chu vi hinh chu nhat: " + P);
    }
}

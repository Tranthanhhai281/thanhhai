package Buoi9.BT;

import java.util.Scanner;

public class Circle implements IShape, IContentShape{
    private int banKinh;

    public Circle() {
    }

    public Circle(int banKinh) {
        this.banKinh = banKinh;
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void descript() {
        System.out.println("Nhap thong tin hinh tron: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh : ");
        this.banKinh = sc.nextInt();
    }

    @Override
    public void area() {
        float S;
        S = (float)(this.banKinh * this.banKinh * 3.14);
        System.out.printf("Dien tich hinh tron: %f%n",S);
    }

    @Override
    public void perimeter() {
        float C;
        C = (float) (this.banKinh * 2 * 3.14);
        System.out.printf("Chu vi hinh tron: %f%n",C);
    }
}

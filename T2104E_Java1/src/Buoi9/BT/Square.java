package Buoi9.BT;

import java.util.Scanner;

public class Square implements IShape, IContentShape{
    private int canh;

    public Square() {
    }

    public Square(int canh) {
        this.canh = canh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    @Override
    public void descript() {
        System.out.println("Nhap thong tin hinh vuong:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh : ");
        this.canh = sc.nextInt();
    }

    @Override
    public void area() {
        int S;
        S = this.canh * this.canh;
        System.out.println("dien tich hinh vuong: " + S);
    }

    @Override
    public void perimeter() {
        int P;
        P = this.canh * 4;
        System.out.println("Chu vi hinh vuong: " + P);
    }
}

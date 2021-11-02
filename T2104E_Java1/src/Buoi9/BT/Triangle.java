package Buoi9.BT;

import java.util.Scanner;

public class Triangle implements IShape, IContentShape {
    private int canh1;
    private int canh2;
    private int canh3;

    public Triangle() {

    }

    public Triangle(int canh1, int canh2, int canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    @Override
    public void descript() {
        System.out.println("Nhap thong tin tam giac: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh 1: ");
        this.canh1 = sc.nextInt();
        System.out.println("Nhap canh 2: ");
        this.canh2 = sc.nextInt();
        System.out.println("nhap canh 3: ");
        this.canh3 = sc.nextInt();
    }

    @Override
    public void area() {
        float p, S;
        p = (float)(this.canh1 + this.canh2 + this.canh3) / 2;
        S = (float) Math.sqrt(p*(p-this.canh1)*(p-this.canh2)*(p-this.canh3));
        System.out.printf("Dien tich tam giac: %f%n",S);
    }

    @Override
    public void perimeter() {
        int P;
        P = this.canh1 + this.canh2 + this.canh3;
        System.out.println("Chu vi hinh tam giac: " + P);
    }
}

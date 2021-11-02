package Buoi4;

import java.util.Scanner;

public class Vuong {
    public int canh;

    public Vuong() {

    }

    public Vuong(int canh) {
        this.canh = canh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public void napHinhVuong(){
        System.out.println("Nhap thong tin hinh vuong:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh : ");
        this.canh = sc.nextInt();
    }

    public void tinhHinhVuong(){
        int P;
        P = this.canh * 4;
        System.out.println("Chu vi hinh vuong: " + P);
        int S;
        S = this.canh * this.canh;
        System.out.println("dien tich hinh vuong: " + S);
    }
}

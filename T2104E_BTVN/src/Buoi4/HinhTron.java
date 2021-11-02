package Buoi4;

import java.util.Scanner;

public class HinhTron {
    public int banKinh;

    public HinhTron() {

    }

    public HinhTron(int banKinh) {
        this.banKinh = banKinh;
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public void nhapHinhTron(){
        System.out.println("Nhap thong tin hinh tron:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh : ");
        this.banKinh = sc.nextInt();
    }

    public void tinhHinhTron(){
        float C;
        C = (float) (this.banKinh * 2 * 3.14);
        System.out.printf("Chu vi hinh tron: %f%n",C);
        float S;
        S = (float)(this.banKinh * this.banKinh * 3.14);
        System.out.printf("Dien tich tam giac: %f%n",S);
    }
}

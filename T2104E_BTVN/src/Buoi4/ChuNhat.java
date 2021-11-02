package Buoi4;

import java.util.Scanner;

public class ChuNhat {
    public int canhNgang;
    public int canhDoc;

    public ChuNhat() {

    }

    public ChuNhat(int canhNgang, int canhDoc) {
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

    public void nhapChuNhat(){
        System.out.println("Nhap thong tin hinh chu nhat: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh ngang: ");
        this.canhNgang = sc.nextInt();
        System.out.println("Nhap canh doc: ");
        this.canhDoc = sc.nextInt();
    }

    public void tinhChuNhat(){
        int P , S;
        P = (this.canhNgang + this.canhDoc) * 2;
        System.out.println("Chu vi hinh chu nhat: " + P);
        S = this.canhNgang * this.canhDoc;
        System.out.println("Dien tich hinh chu nhat: " + S);
    }
}

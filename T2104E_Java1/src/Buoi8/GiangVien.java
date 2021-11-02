package Buoi8;
//class abstract: fields + ham(co dinh nghia) + ham(abstract: khong co dinh nghia/ khong co than ham)
// khong tao duoc doi tuong tu class abstract: khong dung new GiangVien()

import Buoi7.Nguoi;

import java.util.Date;
import java.util.Scanner;

public abstract class  GiangVien extends Nguoi {
    private String maGV;
    private String emailGV;
    public static final int LuongBH = 800000;
    public static final int LuongCB = 1000000;
    public static final int Luong1Gio = 100000;

    public GiangVien() {
    }

    public GiangVien(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt,
                     String email, String maGV, String emailGV) {
        super(hoTen, ngaySinh, gioiTinh, diaChi, sdt, email);
        this.maGV = maGV;
        this.emailGV = emailGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getEmailGV() {
        return emailGV;
    }

    public void setEmailGV(String emailGV) {
        this.emailGV = emailGV;
    }

    @Override
    public  void nhapTT(){
        //nhap tt ve nguoi cua GV
        super.nhapTT();
        //nhap TT cua rieng GV
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma GV: ");
        this.maGV = sc.nextLine();
        System.out.println("Email GV: ");
        this.emailGV = sc.nextLine();
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                super.toString() +
                "maGV='" + maGV + '\'' +
                ", emailGV='" + emailGV + '\'' +
                "; luong: " + this.tinhLuong() +
                '}';
    }

    //tao 1 quy dinh/ rang buoc -> abstract
    //ham chi co khai bao   khong co dinh nghia/ than ham
    public abstract float tinhLuong();

}

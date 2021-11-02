package Buoi7;

import java.util.Date;
import java.util.Scanner;

// class con - lop dan xuat: dinh nghia them dac diem hanh vi mo rong them tu class cha(cha chua dinh nghia)
public class SinhVien extends Nguoi{
    //fields: dac diem rieng cua SinhVien ma Nguoi chua co
    private String maSv;
    private String maLop;
    //methods: hanh vi rieng + mo rong hanh vi cua lop cha


    public SinhVien() {
    }

    public SinhVien(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt, String email,
                    String maSv, String maLop) {
        super(hoTen, ngaySinh, gioiTinh, diaChi, sdt, email);
        this.maSv = maSv;
        this.maLop = maLop;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public void nhapSv(){
        //nhap thong tin cua Nguoi
        super.nhapTT();
        //nhap thong tin rieng cua Sv
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma SV: ");
        this.maSv = sc.nextLine();
        System.out.println("Nhap ma Lop: ");
        this.maLop = sc.nextLine();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                super.toString() +
                ", maSv='" + maSv + '\'' +
                ", maLop='" + maLop + '\'' +
                '}';
    }


}

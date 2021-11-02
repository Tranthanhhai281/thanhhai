package Buoi4;

import java.util.Scanner;

public class TruongHoc {
    //b1: tao cac bien in
    private String tenTruong;
    private String diaChi;
    private int namThanhLap;
    private String trucThuoc;
    private String heDaoTao;

    //b2:
    public TruongHoc() {
        super();
    }

    public TruongHoc(String tenTruong, String diaChi, int namThanhLap, String trucThuoc, String heDaoTao) {
        super();
        this.tenTruong = tenTruong;
        this.diaChi = diaChi;
        this.namThanhLap = namThanhLap;
        this.trucThuoc = trucThuoc;
        this.heDaoTao = heDaoTao;
    }

    //b3:
    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamThanhLap() {
        return namThanhLap;
    }

    public void setNamThanhLap(int namThanhLap) {
        this.namThanhLap = namThanhLap;
    }

    public String getTrucThuoc() {
        return trucThuoc;
    }

    public void setTrucThuoc(String trucThuoc) {
        this.trucThuoc = trucThuoc;
    }

    public String getHeDaoTao() {
        return heDaoTao;
    }

    public void setHeDaoTao(String heDaoTao) {
        this.heDaoTao = heDaoTao;
    }

    //b4:
    public void nhapTT(){
        System.out.println("Nhap thong tin truong hoc: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten Truong: ");
        this.tenTruong = sc.nextLine();
    }

    @Override
    public String toString() {
        return "TruongHoc{" +
                "tenTruong='" + tenTruong + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", namThanhLap=" + namThanhLap +
                ", trucThuoc='" + trucThuoc + '\'' +
                ", heDaoTao='" + heDaoTao + '\'' +
                '}';
    }
}

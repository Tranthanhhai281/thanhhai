package Buoi8;

import java.util.Date;
import java.util.Scanner;

public class GiangVienFullTime extends GiangVien{

    private float hsLuongCapBac;
    private float hsLuongBh;

    public GiangVienFullTime() {
    }

    public GiangVienFullTime(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt,
                             String email, String maGV, String emailGV, float hsLuongCapBac,
                             float hsLuongBh) {
        super(hoTen, ngaySinh, gioiTinh, diaChi, sdt, email, maGV, emailGV);
        this.hsLuongCapBac = hsLuongCapBac;
        this.hsLuongBh = hsLuongBh;
    }

    public float getHsLuongCapBac() {
        return hsLuongCapBac;
    }

    public void setHsLuongCapBac(float hsLuongCapBac) {
        this.hsLuongCapBac = hsLuongCapBac;
    }

    public float getHsLuongBh() {
        return hsLuongBh;
    }

    public void setHsLuongBh(float hsLuongBh) {
        this.hsLuongBh = hsLuongBh;
    }

    @Override
    public void nhapTT(){
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.println("He so luong bao hiem: ");
        this.hsLuongBh = sc.nextFloat();
        System.out.println("He so luong cap bac: ");
        this.hsLuongCapBac = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "GiangVienFullTime{" +
                super.toString() +
                "hsLuongCapBac=" + hsLuongCapBac +
                ", hsLuongBh=" + hsLuongBh +
                '}';
    }

    @Override
    public float tinhLuong() {
        return this.hsLuongBh * GiangVien.LuongBH + this.hsLuongCapBac * GiangVien.LuongCB;
    }

}

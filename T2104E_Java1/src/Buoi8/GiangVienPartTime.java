package Buoi8;

import java.util.Date;

public class GiangVienPartTime extends GiangVien{
    private int sogio;

    public GiangVienPartTime() {
    }

    public GiangVienPartTime(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt,
                             String email, String maGV, String emailGV, int sogio) {
        super(hoTen, ngaySinh, gioiTinh, diaChi, sdt, email, maGV, emailGV);
        this.sogio = sogio;
    }

    public int getSogio() {
        return sogio;
    }

    public void setSogio(int sogio) {
        this.sogio = sogio;
    }

    @Override
    public String toString() {
        return "GiangVienPartTime{" +
                super.toString() +
                "sogio=" + sogio +
                '}';
    }

    @Override
    public float tinhLuong() {
        return this.sogio * GiangVien.Luong1Gio;
    }
}

package Buoi7;
//1. tao class cha: dac diem va hanh vi chung cua cac class con

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

// class final: class khong cho phep ke thua (vo sinh)
//Comparable: tao 1 quy tac sap xep cho cac doi tuong cua lop Nguoi
public class Nguoi implements Comparable<Nguoi>{
    //fields
    protected String hoTen;
    protected Date ngaySinh;
    protected char gioiTinh;
    protected String diaChi;
    protected String sdt;
    protected String email;
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM//yyyy");
    //method
    //constructor

    public Nguoi() {
    }

    public Nguoi(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
    }
    //get,set

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Character getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        this.hoTen = sc.nextLine();
        while (this.ngaySinh == null) {
            System.out.println("Ngay sinh (dd/MM/yyyy)");
            try {
                this.ngaySinh = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Gioi tinh: ");
        try {
            //doan code co the phat sinh ra ngoai le
            this.gioiTinh = (char) sc.nextInt();//
            String str = null;
            System.out.println("Do dai cua str: " + str.length());
            System.out.println("Gioi tinh: " + this.gioiTinh);
        }catch (InputMismatchException e){
            // bat doi tuong ngoai le sinh ra o trong khoi try va xu ly no
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage() + ": " + e.getCause());
        }
        sc.nextLine();
        System.out.println("Dia Chi: ");
        this.diaChi = sc.nextLine();
        System.out.println("SDT: ");
        this.sdt = sc.nextLine();
        System.out.println("Email: ");
        this.email = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + sdf.format(ngaySinh) +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Nguoi other) {
        // so sanh giau 2 doi tuong nguoi: this(p1) va o(p2)
        // tang dan: p1 compareTo p2
        // giam dan: p2 compareTo p1
        // = 0: equals true
        /*
         * tang dan theo ngay sinh, neu ngay sinh = nhau thi giam dan gioi tinh (char)
         */
        if (other == null)
            return -1;
        int sosanhNgaySinh = this.getNgaySinh().compareTo(other.getNgaySinh());
        if (sosanhNgaySinh == 0){
            // giam dan gioi tinh
            char gt = this.getGioiTinh();
            // wrapper cua kieu primitive char, tu nguyen thuy -> class tham chieu
            //Character ch = this.getGioiTinh();
            return other.getGioiTinh().compareTo(this.getGioiTinh());
        }
        return 0;
    }
}

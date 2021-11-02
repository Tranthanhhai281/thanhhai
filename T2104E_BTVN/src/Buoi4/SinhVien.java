package Buoi4;
/*
Tạo lớp SinhVien có các thông tin họ tên (String), năm sinh (int), mã sinh viên (String), điểm toán, điểm văn, điểm anh (float), email (String)
Các phương thức:
-	nhập thông tin sinh viên, yêu cầu thông tin năm sinh > 0, điểm (toán, văn, anh ) trong khoảng [0-10]
-	hiển thị thông tin sinh viên.
-	Tính điểm tb từ điểm toán, văn, anh và từ điểm trung bình xem loại của sinh viên là gì ( < 5: Yếu, 5 -> 7: Trung bình, 7->9: khá, >9: Giỏi )

 */

import java.util.Scanner;

public class SinhVien {
    public String hoTen;
    public int namSinh;
    public String maSV;
    public String email;
    public float diemToan;
    public float diemVan;
    public float diemAnh;

    public SinhVien() {

    }

    public SinhVien(String hoTen, int namSinh, String maSV, String email, float diemToan, float diemVan, float diemAnh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.maSV = maSV;
        this.email = email;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    public float getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(float diemAnh) {
        this.diemAnh = diemAnh;
    }

    public void nhapTT(){
        System.out.println("Nhap thong tin sinh vien: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        this.hoTen = sc.next();
        while (this.namSinh <= 0) {
            System.out.println("Nhap nam sinh: ");
            this.namSinh = sc.nextInt();
        }
        System.out.println("Nhap ma Sv: ");
        this.maSV = sc.next();
        System.out.println("Nhap email: ");
        this.email = sc.next();
        while (true){
            if (this.diemToan >= 0 && this.diemToan <= 10){
                System.out.println("Nhap diem toan: ");
                this.diemToan = sc.nextInt();
                break;
            }
        }
        while (true){
            if (this.diemVan >= 0 && this.diemVan <= 10){
                System.out.println("Nhap diem Van: ");
                this.diemVan = sc.nextInt();
                break;
            }
        }
        while (true){
            if (this.diemAnh >= 0 && this.diemAnh <= 10){
                System.out.println("Nhap diem Anh: ");
                this.diemAnh = sc.nextInt();
                break;
            }
        }
    }

    public void xeploai(){
        float diemTB;
        diemTB = (this.diemToan + this.diemVan + this.diemVan) / 3;
        System.out.println(" Diem trung binh la: ");
        if(diemTB > 9){
            System.out.printf("%f: Gioi %n", diemTB);
        }else if (diemTB >= 7){
            System.out.printf("%f: Kha %n", diemTB);
        }else if (diemTB >= 5){
            System.out.printf("%f: Trung Binh %n", diemTB);
        }else {
            System.out.printf("%f: Yeu %n",diemTB);
        }
    }
}

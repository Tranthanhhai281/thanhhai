package Buoi4;
/*
Tạo lớp Caculator có 2 fields num1, num2 (int).
-	Viết 2 hàm constructor có 2 tham số (int, int), gán giá trị cho các fields
-	Tạo hàm nhap va xuat thông tin 2 số
-	Tạo các hàm cộng, trừ, nhân, chia, lũy thừa
-	Tạo hàm xác định num2 có phải là ước của num1 hay không
-	Viết hàm main để thực hiện

 */

import java.util.Scanner;

public class Caculator {
    private int num1;
    private int num2;

    public Caculator() {

    }

    public Caculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void nhapTT(){
        System.out.println("Nhap vao hai so: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu 1: ");
        this.num1 = sc.nextInt();
        System.out.println("Nhap vao so thu 2: ");
        this.num2 = sc.nextInt();
    }

    public void tinhTong(){
        int sum = 0;
        sum = this.num1 + this.num2;
        System.out.println("Tong hai so: " + sum);
    }

    public void tinhHieu(){
        int hieu = 0;
        hieu = this.num1 - this.num2;
        System.out.println("Hieu hai so: " + hieu);
    }

    public void tinhTich(){
        int tich = 0;
        tich = this.num1 * this.num2;
        System.out.println("Tich hai so: " + tich);
    }

    public void tinhThuong(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (num2 != 0) {
                System.out.printf("Thuong cua hai so: %d%n", (this.num1/this.num2));
                break;
            }else{
                System.out.println("So khong phu hop moi nhap lai: ");
                this.num2 = sc.nextInt();
            }
        }
    }

    public void tinhLuyThua(){
        int luythua;
        luythua = (int) Math.pow(this.num1,this.num2);
        System.out.println("Luy thua hai so: " + luythua);
    }

    public void xacDinhUoc(){
        if (this.num1 % this.num2 == 0){
            System.out.printf("%d la uoc cua %d", this.num2, this.num1);
        }else {
            System.out.printf("%d khong la uoc cua %d", this.num2, this.num1);
        }
    }
}

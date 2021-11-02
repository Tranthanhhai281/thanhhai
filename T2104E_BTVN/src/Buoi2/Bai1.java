package Buoi2;
/*
Viết chương trình tính tiền cho bài toán ra quán chơi game
-	Nhập vào giờ bắt đầu (int) và giờ kết thúc (int)
-	Kiểm tra điều kiện, nếu giờ bắt đầu >= giờ kết thúc thì hiển thị màn hình, nhập không đúng
-	Nếu số giờ chơi < 18h thì giá chơi: 30000/1h, còn ngược lại thì 25000/1h.
-	HIển thị số giờ chơi và thông báo số tiền
Sử dụng lệnh if để xây dựng chương trình.

 */

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args){
        System.out.println("-----Tinh tien gio choi------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gio bat dau: ");
        int a = sc.nextInt();
        System.out.println("Nhap gio ket thuc: ");
        int b = sc.nextInt();
        int x = b - a;
        if(a >= b){
            System.out.println("Nhap khong dung");
        }else if (x < 18){
            System.out.printf("So gio choi la: %d%n", x);
            System.out.printf("So tien tra la: %d%n", x*30000);
        }else {
            System.out.printf("So gio choi la: %d%n", x);
            System.out.printf("So tien tra la: %d%n",x*25000);
        }
    }
}

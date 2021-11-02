package Buoi2;
/*
Viết chương trình giải phương trình bậc hai: ax2 + bx + c = 0;
Trong đó a, b, c là 3 số nguyên nhập từ bàn phím. Tìm x và hiển thị kết quả.
Sử dụng thư viện: Math.sqrt() để tính căn bậc 2 dương của 1 số.

 */

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args){
        System.out.println("giai Phuong trinh bac 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        int a = sc.nextInt();
        System.out.println("Nhap he so b: ");
        int b = sc.nextInt();
        System.out.println("Nhap he so c: ");
        int c = sc.nextInt();
        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.println("Phuong trinh co vo so nghiem");
                }else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else {
                System.out.printf("Phuong trinh co nghiem duy nhat: %f", -c/(double)b);
            }
        }else {
            double delta;
            delta = b*b-4*a*c;
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            if(delta == 0){
                System.out.printf("phuong trinh co nghiem kep la: %f", -b/(double)(2*a));
            }
            if (delta > 0){
                System.out.printf("Phuong trinh co hai nghiem phan biet: x1 =  %f", (-b + Math.sqrt(delta))/(2 * a));
                System.out.printf("; x2 = %f", (-b - Math.sqrt(delta))/(2*a));
            }
        }
    }
}

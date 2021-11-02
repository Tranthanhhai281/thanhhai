package Buoi3;
/*
Nhập n là 1 số nguyên dương, nếu nhập không đúng yêu cầu nhập lại.
Thực hiện và in ra kết quả của 2 phép tính:
1/1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
1/1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n

 */

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so n: ");
        n = sc.nextInt();
        while (n <= 0) {
            System.out.println("so nhap khong hop le moi nhap lai: ");
            n = sc.nextInt();
            if (n > 0) {
                break;
            }
        }
        float ketqua1 = 0, ketqua2 = 0;
        int pre = -1;

        for (int x = 1; x <= n; x++) {
            ketqua1 += (double)(1/x);
        }
        System.out.printf("Tong cua day la: %.2f%n", ketqua1);

        for (int y = 1; y <= n; y++){
            pre *= (-1);
            ketqua2 += pre *(double)(1/y);
        }
        System.out.printf("Tong cua day so: %.2f%n", ketqua2);
    }
}

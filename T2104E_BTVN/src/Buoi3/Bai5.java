package Buoi3;
/*
Nhập 1 số nguyên dương thể hiện chiều cao của tam giác cân, số đó không phải là số nguyên dương > 0 thì yêu cầu nhập lại.
Thực hiện chương trình in ra tam giác cân *

Tương tự hiển thị hình chữ nhật * khi nhập chiều dài và chiều rộng của hình chữ nhật.
 */

import java.util.Scanner;

public class Bai5 {

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

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.print("\n");
        }

        int a, b;
        System.out.println("Nhap chieu ngang: ");
        a = sc.nextInt();
        System.out.println("Nhap chieu doc: ");
        b = sc.nextInt();
        while (a <= 0 || b <= 0) {
            System.out.println("so nhap khong hop le moi nhap lai: ");
            System.out.println("Nhap chieu ngang: ");
            a = sc.nextInt();
            System.out.println("Nhap chieu doc: ");
            b = sc.nextInt();
            if (a > 0 && b > 0) {
                break;
            }
        }

        for (int i = 1; i <= b; i++){
            for (int j = 1; j <= a; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

package Buoi3;

import java.util.Scanner;

public class Calculator {
    /*
    * may tinh:
    * 1: phep cong
    * 2: phep tru
    * 3: phap nhan
    * 4: phep chia: -lap(num2 = 0)
    * 5: phep lay du: - lap(num2 = 0)
    * 6: phep luy thua num1^num2
    * 7: thoat
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--Calculator--");
        int choose = 0, num1, num2;
        String confirm = "";

        do {
            System.out.println("1: Phep cong");
            System.out.println("2: Phep tru");
            System.out.println("3: Phep nhan");
            System.out.println("4: Phep chia");
            System.out.println("5: Phep lay du");
            System.out.println("6: Phep luy thua");
            System.out.println("7: Thoat");

            // nhap thong tin dau vao
            System.out.println("nhap so thu 1: ");
            num1 = sc.nextInt();
            System.out.println("Nhap so thu 2: ");
            num2 = sc.nextInt();

            // nhap lua chon
            while(true){
                System.out.println("Nhap lua chon (1-7): ");
                choose = sc.nextInt();
                if (choose >= 1 && choose <= 7){
                    break;
                }
            }

            // thuc hien phep tinh
            switch (choose) {
                case 1:
                    System.out.printf("Tong hai so: %d%n", num1 + num2);
                    break;
                case 2:
                    System.out.printf("Hieu hai so: %d%n", num1 - num2);
                    break;
                case 3:
                    System.out.printf("Tich hai so: %d%n", num1 * num2);
                    break;
                case 4:
                    while (true) {
                        if (num2 != 0) {
                            System.out.printf("Thuong cua hai so: %d%n", num1 / num2);
                            break;
                        }else{
                            System.out.println("So khong phu hop moi nhap lai: ");
                            num2 = sc.nextInt();
                        }
                    }
                    break;
                case 5:
                    while (true) {
                        if (num2 != 0) {
                            System.out.printf("Thuongcua hai so: %d%n", num1 % num2);
                            break;
                        }else{
                            System.out.println("So khong phu hop moi nhap lai: ");
                            num2 = sc.nextInt();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Luy thua hai so: " + Math.pow(num1,num2));
                    break;
                case 7:
                    break;
            }
            sc.nextLine();

            // confirm de thuc hien lai chuong trinh
            System.out.println("ban co muon tiep tuc chuong trinh hay khong? (y: ok) ");
            confirm = sc.nextLine();

            // a.equals(b): so sanh gia tri chuoi a trung khop chuoi b
        }while (confirm.equalsIgnoreCase("y"));
    }
}

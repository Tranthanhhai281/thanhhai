package Buoi2;
/*
Nhập vào tháng, năm bất kỳ. In ra số ngày tương ứng với tháng, năm đó.
Sử dụng kiểu ENUM, switch để xây dựng chương trình
 */

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args){
        System.out.println("----in ra thang, nam----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int thang =sc.nextInt();
        System.out.println("Nhap nam: ");
        int nam = sc.nextInt();
        int songay = 0;
        if(thang >= 1 && thang <= 12){
            switch (thang){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    songay = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    songay = 30;
                    break;
                case 2:
                    if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)){
                        songay = 29;
                    }else {
                        songay = 28;
                    }
                    break;
            }
            System.out.println("Thang " +thang+ " nam " +nam+ " co " +songay+ "ngay");
        }else {
            System.out.println("Thang Khong hop le!");
        }
    }
}

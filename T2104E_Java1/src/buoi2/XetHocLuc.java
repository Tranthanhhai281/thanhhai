package buoi2;
/*
Nhap 1 so float tu ban phim la diem cua 1 hoc sinh
        Xet diem cua hs de xep loai hoc luc hoc sinh do:
        - Neu diem >= 9: xuat sac
        - diem < 9 va diem > 7: Kha
        - diem < 7 va diem >= 4: trung binh
        - con lai: yeu

 */

import java.util.Scanner;

public class XetHocLuc {

    public static void main(String[] args){
        System.out.println("------xet hoc luc------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem hoc sinh: ");
        float diem = sc.nextFloat();
        if (diem < 0 || diem > 10){
            System.out.printf("%f khong hop le %n", diem);
        }else {
            if(diem >= 9){
                System.out.printf("%f: xuat sac %n", diem);
            }else if (diem >= 7){
                System.out.printf("%f: kha %n", diem);
            }else if (diem >= 4){
                System.out.printf("%f: trung binh %n", diem);
            }else {
                System.out.printf("%f: yeu %n",diem);
            }
        }
    }

}

package buoi2;

import java.util.Scanner;

// giai Pt bac 1
public class GiaiPTbac1 {

    public static void main(String[] args){
        //ax + b = 0;
        System.out.println("giai Phuong trinh bac 1");
        //tao doi tuong nhap tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hs a: ");
        int a = sc.nextInt();
        System.out.println("Nhap hs b: ");
        int b = sc.nextInt();
        String result = (a == 0)?((b == 0)?"PT vo so nghiem": "Pt vo nghiem"):("PT co 1 nghiem" + -b/(float)a);
        System.out.println("ket qua: " + result);
    }
}

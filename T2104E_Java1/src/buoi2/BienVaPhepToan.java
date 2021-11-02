package buoi2;

import java.util.Scanner;

// class BienvaPhepToan
/*
comment nhien dong:
- khai bao va gan bien
- pham vi bien local
- toan tu trong java
- hang java
 */
public class BienVaPhepToan {
    // bien instance/ doi tuong
    // bien lop/ stactic
    public static void main(String[] args){
        //bien local:trong ham trong khoi code{}
        // khai bao bien
        int count = 100;
        //gan gia tri cho bien =
        count = 1000;
        String tenSinhVien = "Pham Thi dung";
        // kieu nguyen thuy
        byte age = 80;
        short sAge = 130;
        // ep kieu ngam dinh: gan gia tri kieu thap hon cho kieu lon lon
        sAge = age;
        int iAge = 32900;
        long lAge = 10L;
        float fAge = 15.5f;
        double dAge = 15.54;
        char gioiTinh = 'M';
        boolean isMua = true;
        // kieu tham chieu: gia tri dia chi tham chieu toi noi chua gia tri
        String tenSinhvien = "Pham\"\b Thi \n Dung";
        //in ra man hinh console
        // in tren dong:
        System.out.print(sAge + "\n");
        System.out.printf("%d%n", sAge);
        //in tren 1 dong ket thuc xuong dong
        System.out.println("Hello World");
        System.out.println("java co ban buoi 2");
        // hang:
        final float PI = 3.14F;
        //PI = 3.1413;
        //luong nhap vao tu ban phim System.in
        // tao ra doi tuong nhan luong in tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tuoi 1 sinh vien: ");
        // nguoi dung nhap 1 so nguyen tu ban phim va gan cho bien iAge
        /*
        iAge = sc.nextInt();
        System.out.printf("tuoi sv: %d%n", iAge);
        System.out.println("Nhap 1 so thuc: ");
        fAge = sc.nextFloat();
        System.out.println("Nhap 1 so long: ");
        lAge = sc.nextLong();
        System.out.println("Nhap ten sinh vien: ");
        tenSinhVien = sc.nextLine();
        System.out.println("ten sv: " + tenSinhVien + "tuoi: " + lAge);

         */
        int num = 10;
        int num2 = num++;
        int num3 = ++num;
        System.out.println(num++);
        System.out.println(++num);
        // == so sanh == chi dung voi cac kieu du lieu nguyen thuy
        System.out.println("age == 80: " + (age==80));
        String className = new String("T2104E");
        className = "T2104E";
        System.out.println("className = " + className + ":" + (className == "T2104E"));
        Object doiTuong = new Object();
    }
}

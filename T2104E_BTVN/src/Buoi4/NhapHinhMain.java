package Buoi4;
/*
Viết chương trình theo menu để tính chu vi và diện tích của các hình thông tin cạnh nhập từ bàn phím theo lựa chọn của người dùng.
-	1. Tam giác
	Ng dùng nhập 1: thì yc người dùng nhập 3 cạnh a, b, c
-	2. Hình vuông
	Ng dùng nhập 2: thì yêu cầu nhập cạnh hv
-	3. Hình tròn
	Ng dùng nhập 3: thì yêu cầu nhập bán kính hình tròn
-	4. Hình chữ nhật
	Ng dùng nhập 4: thì yêu cầu nhập chiều dài, chiều rộng

Hỏi người dùng có tiếp tục hay không?

 */

import java.util.Scanner;

public class NhapHinhMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        String confirm = "";
        System.out.println("Chon hinh ma ban muon: ");
        do {
            System.out.println("1: Tam giac");
            System.out.println("2: Hinh Vuong");
            System.out.println("3: Hinh Tron");
            System.out.println("4: Hinh Chu Nhat");

            while(true) {
                System.out.println("Nhap lua chon (1-4): ");
                choose = sc.nextInt();
                if (choose >= 1 && choose <= 4) {
                    break;
                }
            }

            switch (choose) {
                case 1:
                    TamGiac tamgiac = new TamGiac();
                    tamgiac.nhapTamGiac();
                    tamgiac.tinhTamGiac();
                    break;
                case 2:
                    Vuong hinhvuong = new Vuong();
                    hinhvuong.napHinhVuong();
                    hinhvuong.tinhHinhVuong();
                    break;
                case 3:
                    HinhTron hinhtron = new HinhTron();
                    hinhtron.nhapHinhTron();
                    hinhtron.tinhHinhTron();
                    break;
                case 4:
                    ChuNhat hinhchunhat = new ChuNhat();
                    hinhchunhat.nhapChuNhat();
                    hinhchunhat.tinhChuNhat();
                    break;
            }
            sc.nextLine();
            System.out.println("ban co muon tiep tuc chuong trinh hay khong? (y: ok) ");
            confirm = sc.nextLine();
        }while (confirm.equalsIgnoreCase("y"));
    }
}

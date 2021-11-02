package Buoi5;

import java.util.Scanner;

// mang 1 chieu
public class Mang1ChieuDemo {

    public static void main(String[] args){
        //String m = null;
        //System.out.println(m.equals("a"));  // nul khong duoc tham chieu
        //khai bao
        float point;
        float[] points;
        // khoi tao
        points = new float[10];
        System.out.println("Gia tri mac dinh cua phan tu dau tien: " + points[0]);
        System.out.println("Kich thuoc cua mang: " + points.length);
        //khoi tao bien mang + khoi tao cac gia tri cua phan tu mang
        String[] dsLoptoi = {"T2104E", "T2103E", "T2102E", "T2101E"};
        //duyet mang:
        //for: index
        for (int i = 0; i < dsLoptoi.length; i++){
            System.out.print(dsLoptoi[i] + " ");
        }
        System.out.println();
        //foreach
        for (String lop : dsLoptoi){
            System.out.print(lop + " ");
        }
        System.out.println();
        //thao tac toi phan tu mang
        for (float tmp : points){
            System.out.print(tmp + " ");
        }
        System.out.println();
        System.out.println("Nhap danh sach cac diem: ");
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (true){
            //nghiep vu: nhap 1 diem, luu diem vao phan tu tiep theo cua mang
            System.out.println("Nhap diem: ");
            float pp = sc.nextFloat();
            points[index++] = pp;
            //b3: t5ang/giam gia tri lap
            // dk thaot lap
            sc.nextLine();
            if (index == points.length){
                break;
            }
            System.out.println("ban co muon nhap phan tu tiep theo hay khong? (n: thoat");
            String comfirm = sc.nextLine();
            if ("n".equals(comfirm)){
                break;
            }
        }
        System.out.println("Hien thi danh sach mang sau khi nhap: ");
        for (float tmp : points){
            System.out.println(tmp + " ");
        }
        System.out.println();
        System.out.println("Hien thi ds mang cac phan tu da nhap: ");
        for (int i = 0; i < index; i++){
            System.out.println(points[i] + " ");
        }
        System.out.println();
    }
}

package Buoi9.BT;

import java.util.Scanner;

/*
Xây dựng chương trình tính chu vi, diện tích, mô tả đặc điểm của hình tam giác, hình vuông, hình chữ nhật, hình tròn. Sử dụng interface:
-	Tạo interface IShape chứa method tính diện tích (area) và tính chu vi (perimeter)
-	Tạo interface IContent chứa method mô tả đặc điểm (descript)
-	Tạo các class Triangle, Square, Rectangle, Circle thực thi 2 interface IShape và IContent
+ Triangle
+ Square
+ Rectangle
+ Circle
-	Tạo class ShapeManager quản lý tập danh sách hình trên
-	Tạo chương trình quản lý, lựa chọn phương thức thực thi:
+ 1: Thêm 1 hình bất kỳ vào danh sách
+ 2: Thêm 1 hình tam giác vào danh sách
+ 3: Thêm 1 hình vuông vào danh sách
+ 4: Thêm 1 hình chữ nhật vào danh sách
+ 5: Thêm 1 hình tròn vào danh sách
+ 6: Tìm danh sách hình theo loại ( vd nhập “circle” thì cần tìm danh sách hình tròn trong list)
+ 7: Xóa danh sách hình theo loại ( như câu 6) + 8: hiển thị danh sách thông tin
+9: Thoát

 */
public class ShapeManager {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        String confirm = "";
        System.out.println("Lựa chọn phương thức thực thi: ");
        do {
            System.out.println("1: Thêm 1 hình bất kỳ vào danh sách");
            System.out.println("2: Thêm 1 hình tam giác vào danh sách");
            System.out.println("3: Thêm 1 hình vuông vào danh sách");
            System.out.println("4: Thêm 1 hình chữ nhật vào danh sách");
            System.out.println("5: Thêm 1 hình tròn vào danh sách");
            System.out.println("6: Tìm danh sách hình theo loại");
            System.out.println("7: Xóa danh sách hình theo loại");
            System.out.println("8: Hiển thị danh sách thông tin");
            System.out.println("9: Thoát");

            do {
                System.out.println("Nhap lua chon (1-9): ");
                choose = sc.nextInt();
            } while (choose < 1 || choose > 9);

            sc.nextLine();
            System.out.println("ban co muon tiep tuc chuong trinh hay khong? (y: ok) ");
            confirm = sc.nextLine();
        }while (confirm.equalsIgnoreCase("y"));
    }
}

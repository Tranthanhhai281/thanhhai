package Buoi10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args){
        /*
        * - checked exception:
        * - unchecked exception:
        * + parse: chuyen doi tu 1 kieu -> kieu moi(next...) vd: chuoi -> so
        * + format:
        * + object: null
        * + input dau vao
        * + phep tinh toan hoc
        * + mang, danh sach: index
        * + ...
         */
        Scanner sc = new Scanner(System.in);

        try {
            validateDate(sc); // stack: main, validatedate
        } catch (ParseException e) {
            System.out.println("ham main bat loi cua ham validateDate");
        }

        char gioiTinh = '0';
        System.out.println("Gioi tinh: ");
        try {
            //doan code co the phat sinh ra ngoai le
            gioiTinh = (char) sc.nextInt(); // doi tuong ngoai le kieu InputMismatchException nem ra
            String str = null;
            System.out.println("Do dai cua str: " + str.length());
            System.out.println("Gioi tinh: " + gioiTinh);
        }catch (InputMismatchException e){
            // bat doi tuong ngoai le sinh ra o trong khoi try va xu ly no
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage() + ": " + e.getCause());
        } catch (NullPointerException e){
            // bat doi tuong ngoai le NullPointerException sinh ra o trong khoi try va xu ly no
            //e.printStackTrace();
            System.out.println("Error: " + e.getMessage() + e.getCause());
        }

        int num1, num2 = 0;

        num1 = validateNumber(sc);

        while (true) {
            try {
                System.out.println("Nhap num2= ");
                num2 = sc.nextInt();
                if (num2 != 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("So num2 phai la so");
                sc.nextLine();
            }
        }

        System.out.println(num1 + "/" + num2 + "=" + num1 / (float) num2);

        System.out.println("Ket thuc ham Main");
    }

    public static void validateDate(Scanner sc) throws ParseException{
        System.out.println("Ngay sinh (dd/MM/yyyy)");
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM//yyyy");
        Date ngaySinh = sdf.parse(sc.nextLine());
        System.out.println("End validateDate");
    }

    public static int validateNumber(Scanner sc){
        int num1 = 0;
        while (true) {
            try {
                System.out.println("Nhap num1= ");
                num1 = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("So num1 phai la so");
                sc.nextLine();
            }
        }
        return num1;
    }
}

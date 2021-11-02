package Exercise2;

import java.util.Scanner;

public class Flight {
    private int number;
    private String destination;

    public Flight() {
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so hieu chuyen bay: ");
        this.number = sc.nextInt();
        System.out.println("Nhap vao dia diem den: ");
        this.destination = sc.next();
    }

    public void XuatTT(){
        System.out.println("So hieu chuyen bay: " + this.number +
                "; dia diem den: " + this.destination);
    }
}

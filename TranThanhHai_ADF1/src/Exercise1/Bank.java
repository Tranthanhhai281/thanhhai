package Exercise1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Bank {
    private double balance;
    private double rate;

    public Bank() {
    }

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("---Bang tinh tien lai hang thang----");
        try {
            System.out.println("Nhap vao so tien ban vay: ");
            this.balance = sc.nextDouble();
            this.balance = Double.parseDouble(String.valueOf(this.balance));
        } catch (NumberFormatException e) {
            System.out.println("Ban nhap khong phai so. Moi nhap lai: ");
            this.balance = sc.nextDouble();
        }
        try {
            System.out.println("Nhap vao lai suat do ngan hang quy dinh: ");
            this.rate = sc.nextDouble();
            Double.parseDouble(String.valueOf(this.rate));
        } catch (NumberFormatException e) {
            System.out.println("Ban nhap khong phai so. Moi nhap lai: ");
            this.rate = sc.nextDouble();
        }
    }

    public void calculateInterest(){
        double interest;
        interest = this.balance * (this.rate / 1200);
        System.out.println("So tien lai ban phai tra hang thang la: " + interest);
    }
}

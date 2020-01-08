/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiadf1;
import java.util.* ;
/**
 *
 * @author Admin
 */
public class bai1_Bank {
    /**
     * @param args the command line arguments
     */
    public void Bank(double balance, double rate){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap vao so tien vay: ");
            balance = sc.nextDouble();
            System.out.print("Nhap vao lai suat mot nam: ");
            rate = sc.nextDouble();
            double interest ;
            interest = balance * ( rate /1200);
            System.out.println("Lai phai tra hang thang: " + interest);
        }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        bai1_Bank interest = new bai1_Bank();
        
        interest.Bank(0, 0);
    }
}

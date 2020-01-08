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
public class bai2_Flight {
    private int number;
    private String destination;
    
    public bai2_Flight(int name, String destination){
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
    public void display() {
       System.out.println(number + "," + destination);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    bai2_Flight g1 = new bai2_Flight(857, "Toronto");
           System.out.println("Output: ");
           g1.display();
    }
}

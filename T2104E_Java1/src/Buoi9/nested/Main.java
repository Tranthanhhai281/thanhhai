package Buoi9.nested;

import Buoi9.IWorker;
import Buoi9.nested.People.Address;

public class Main {

    public static void main(String[] args){
        People p1 = new People();
        Address ad1 = p1.new Address("HN","Hoan Kiem");
        ad1.showInfoPeople();
        p1.setAddress(ad1);
        p1.checkVung();
        IWorker cn1 = new CongNhan();
        //anounimous class: khong co ten tao ra tu abstract class hoac interface
        IWorker cn2 = new IWorker() {
            @Override
            public void doWork() {
                System.out.println("Cong nhan sua chua oto");
            }
        };
        cn2.doWork();
        IWorker cn3 = new IWorker() {
            int loaicn = 1;
            public void setLoaicn(int loai){
                this.loaicn = loai;
            }
            @Override
            public void doWork() {
                int ca1 = 100000;
                int ca2 = 200000;
                if (this.loaicn ==1)
                    System.out.println("Cong nhan lam viec theo ca tong tien: " + (ca1 + ca2));
                else
                    System.out.println("Cong nhan lam viec theo gio");
            }
        };
        cn3.doWork();

        IWorker cn4 = new IWorker() {
            int loaicn = 1;
            public void setLoaicn(int loai){
                this.loaicn = loai;
            }
            @Override
            public void doWork() {
                int ca1 = 100000;
                int ca2 = 200000;
                if (this.loaicn ==1)
                    System.out.println("Cong nhan lam viec theo ca tong tien: " + (ca1 + ca2));
                else
                    System.out.println("Cong nhan lam viec theo gio");
            }
        };
        cn4 = cn3;
    }
}

class CongNhan implements IWorker{

    @Override
    public void doWork() {
        System.out.println("Cong nhan xay dung");
    }
}

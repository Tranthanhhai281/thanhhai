package Buoi7;

import java.util.ArrayList;

public class SinhVienmain {

    public static void main(String[] args){
        //con se la kieu cha
        Nguoi ng1 = new Nguoi();
        SinhVien sv1 = new SinhVien();
        Nguoi ng2 = new SinhVien();
        System.out.println("Nhap thong tin Sv1: ");
        // tham chieu hanh vi nhapTT cua cha - Nguoi hay con - SinhVien?????
        ng2.nhapTT();
        System.out.println(ng2);
        //ng2.nhapTT(new Scanner(System.in));
        ng2 = ng1;
        ng2 = sv1;
        System.out.println("Nhap thong tin Sv2: ");
        // cha chua chac da la con
        SinhVien sv2 = (SinhVien) ng2;
        sv2.nhapTT();
        System.out.println(sv2);
        System.out.println(sv1);
        System.out.println(ng2);

        SinhVien[] dssv = new SinhVien[1000];
        // dssv[0] = new Nguoi();
        Nguoi[] dsnhansu = new Nguoi[1000];
        dsnhansu[0] = new SinhVien();
        ArrayList<Nguoi> dsnhansu2 = new ArrayList<Nguoi>();
        dsnhansu2.add(new Nguoi());
        dsnhansu2.add(new SinhVien());
        dsnhansu2.add(sv1);
        System.out.println("Duyet ds nhan su: ");
        for (Nguoi ng: dsnhansu2){
            System.out.println(ng.toString());
        }

        /*
        ArrayList list = new ArrayList();
        //them phan tu vao danh sach
        list.add(1);
        list.add(sv2);
        list.add(null);
        list.add(1);
        //lay kich thuoc ds
        System.out.println("size: " + list.size());
        // xoa
        list.remove(null);
        System.out.println("size: " + list.size());
        //cap nhat
        list.set(0,2);
        // lay gia tri tai 1 phan tu -> lay theo chi muc
        Object ob = list.get(0);
        //hien thi ds
        System.out.println("hien thi ds theo foreach: ");
        for (Object obj : list){
            System.out.println(obj);
        }
        System.out.println("Hien thi ds theo interator: ");
        // tao ra dt lap
        Iterator it = list.iterator();
        // xem dt lap con co the lap duoc tiep khong?
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Hien thi ds theo chi muc index: ");

         */

    }
}

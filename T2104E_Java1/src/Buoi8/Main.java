package Buoi8;

import Buoi7.Nguoi;
import Buoi7.SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Main {

    public static void main(String[] args){
        /*
        Nguoi ng1 = new Nguoi();
        Nguoi ng2 = new SinhVien();
        //Giangvien: abstract
        Nguoi ng3 = new GiangVienFullTime();
        Nguoi ng4 = new GiangVienPartTime();
        GiangVien gv1 = new GiangVienFullTime();
        GiangVien gv2 = new GiangVienPartTime();

         */

        //ds chua sv,gv,nv
        QuanLyNhanSu fpt = new QuanLyNhanSu();
        fpt.themNhanSu(new Nguoi("dung",new Date(),'1',"HN","0983644236","a@a.com"));
        // them SV:
        fpt.themNhanSu(new SinhVien("dungpt",new Date(2000,11,10),'1',"HN","0983644236","a@a.com","sv001","t2104e"));
        fpt.themNhanSu(new SinhVien("hapt",new Date(2001,1,1),'0',"HN","0983644236","a@a.com","sv002","t2104e"));
        //them gv:
        fpt.themNhanSu(new GiangVienFullTime());
        fpt.themNhanSu(new GiangVienPartTime());

        //hien thi ds
        fpt.showDsNhanSU(2);
        fpt.showDsNhanSU(1);
        System.out.println("------------danh sach chua sap xep-----------");
        fpt.showDsNhanSU(0);

        //update 1 gv theo magv
        String magv = "gv0010";
        int updated = fpt.updateGiangVien(magv);
        if(updated == 1){
            System.out.println("Update thanh cong!");
        }else {
            System.out.println("update that bai hoac dau vao khong dung!");
        }

        //sap xep
        Collections.sort(fpt.getDsNhanSu());
        System.out.println("------------danh sach da sap xep-----------");
        fpt.showDsNhanSU(0);
        //sap xep tang dan luong cua gv:
        Collections.sort(fpt.getDsNhanSu(), new SapGiamDanTheoTenNhanSu());
        Collections.sort(fpt.getDsNhanSu(), new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                if (o1 == null || o2 == null)
                    return -1;
                return o2.getHoTen().compareTo(o1.getHoTen());
            }
        });
        System.out.println("==========DS Nguoi Sau GiamDanTheoTenNhanSU---------");
        fpt.showDsNhanSU(0);
    }
}

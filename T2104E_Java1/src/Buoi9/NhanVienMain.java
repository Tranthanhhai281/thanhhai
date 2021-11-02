package Buoi9;

import Buoi7.Nguoi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NhanVienMain {

    public static void main(String[] args){
        NhanVien nv1 = new NhanVien("DungPT",new Date(), '0', "HN", "1", "email","nv001", "To chuac lao dong");
        nv1.setType(2);
        nv1.dongPhuc();
        Nguoi nv2 = new NhanVien("HaiPT",new Date(), '1', "HN", "0", "email","nv002", "Bao ve");
        ((NhanVien) nv2).setType(3);
        ((NhanVien) nv2).dongPhuc();
        IWorker nv3 = new NhanVien("NgocPT",new Date(), '0', "HN", "1", "email","nv003", "Le tan");
        ((NhanVien) nv3).setType(1);
        nv3.doWork();
        ((iContent) nv3).dongPhuc();
        //instaneof: nv1: nguoi, NhanVien, Object, IWorker, iContent -> true
        ArrayList<Nguoi> listNv = new ArrayList<Nguoi>();
        List<Nguoi> listNvNew = new ArrayList<Nguoi>();
    }
}

package Buoi8;

import Buoi7.Nguoi;
import Buoi7.SinhVien;

import java.util.ArrayList;

public class QuanLyNhanSu {
    private ArrayList<Nguoi> dsNhanSu;

    public QuanLyNhanSu(ArrayList<Nguoi> dsNhanSu) {
        this.dsNhanSu = dsNhanSu;
    }

    public QuanLyNhanSu() {

    }

    public ArrayList<Nguoi> getDsNhanSu() {
        return dsNhanSu;
    }

    public void setDsNhanSu(ArrayList<Nguoi> dsNhanSu) {
        this.dsNhanSu = dsNhanSu;
    }

    public void themNhanSu(Nguoi nguoi){
        if (nguoi != null) {
            this.dsNhanSu.add(nguoi);
        }
    }

    //tim ds Nguoi theo chua ten tu tham so
    public ArrayList<Nguoi> timDsTheoTen(String name){
        // mo bai
        ArrayList<Nguoi> result = new ArrayList<Nguoi>();
        //nghiep vu
        for (Nguoi ng : this.dsNhanSu){
            if (ng.getHoTen().contains(name)){
                result.add(ng);
            }
        }
        //ket luan
        return result;
    }
    //cap nhat thong tin cua GV tha maGV
    /*
    * int result;
    * = 0: khong tim thay gv theo magv
    * = 1: thanh cong
    * = 2: that bai
     **/
    public int updateGiangVien(String magv){
        if (magv == null || magv.length() == 0){
            return -1;
        }
        //xu ly nghiep vu
        //lay Ging Vien theo magv
        int index = this.timGiangVienTuMA(magv);
        if (index == -1){
            return 0;
        }
        GiangVien gv = (GiangVien) this.dsNhanSu.get(index);
        //nhap lai thong tin gv tim duoc
        System.out.println("Nhap lai thong tim giang vien: ");
        gv.nhapTT();
        //cap nhat doi tuong gv vao list
        if(this.dsNhanSu.set(index,gv) != null){
            return 1;
        }
        return 2;
    }
    //tim giang vien theo magv
    public int timGiangVienTuMA(String magv){
        if(magv == null || magv.length() == 0){
            return -1;
        }
        GiangVien result = null;
        //xu ly nghiep vu
        for (int i = 0; i < this.dsNhanSu.size(); i++){
            Nguoi ng = this.dsNhanSu.get(i);
            //lay nguoi la giang vien
            if (ng instanceof GiangVien){
                GiangVien gv = (GiangVien) ng;
                if (magv.equals(gv.getMaGV())){
                    return i;
                }
            }
        }
        return -1;
    }
    //hien thi ds cac doi tuong theo loai: type = 0: tat ca, type = 1: dssv, type = 2: dsgv
    public void showDsNhanSU(int type){
        if (type == 1){
            System.out.println("hien thi ds sinh vien:");
            for (Nguoi ng : this.dsNhanSu){
                if (ng instanceof SinhVien)
                System.out.println(ng.toString());
            }
        }else if (type == 2){
            System.out.println("hien thi ds giang vien:");
            for (Nguoi ng : this.dsNhanSu){
                if (ng instanceof GiangVien)
                    System.out.println(ng);
            }
        }else {
            for (Nguoi ng : this.dsNhanSu){
                    System.out.println(ng);
            }
        }
    }
}

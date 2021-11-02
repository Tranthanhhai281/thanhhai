package Buoi9;

import Buoi7.Nguoi;

import java.util.Date;
import java.util.Scanner;

public class NhanVien extends Nguoi implements IWorker, iContent{
    // bien
    private String maNV;
    private String phongBan;
    private int type; // 1: le tan, 2: nvphong ban, 3: bao ve

    public NhanVien() {

    }

    public NhanVien(String hoTen, Date ngaySinh, char gioiTinh, String diaChi, String sdt, String email, String maNV, String phongBan) {
        super(hoTen, ngaySinh, gioiTinh, diaChi, sdt, email);
        this.maNV = maNV;
        this.phongBan = phongBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma NV: ");
        this.maNV = sc.nextLine();
        System.out.println("Phong Ban: ");
        this.phongBan = sc.nextLine();
        do {
            System.out.println("Vi tri lam viec: ");
            this.type = sc.nextInt();
        }while (this.type != 1 && this.type != 2 && this.type != 3);
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", maNV='" + maNV + '\'' +
                ", phongBan='" + phongBan + '\'' +
                ", vi tri= " + (this.type==1?"Le tan":(this.type==2?"Nv phong ban":(this.type==3?"bao ve":"Khac"))) +
                '}';
    }

    @Override
    public void doWork() {
        //ktra nv vi tri nao -> db -> lich cong tac
        // ghi nhan -> db
        System.out.println("Nhan vien phai bat dau lam viec tu 8h sang -> 17h chieu.");
        if (this.type == 1){
            System.out.println("Le tan dung lam viec 8h sang -> 17h chieu");
        }else if (this.type == 2){
            System.out.println("Nhan vien bat dau lam viec tu 8h sang -> 17h chieu");
        }else if (this.type == 3){
            System.out.println("Bao ve phai lam viec theo ca");
        }else {
            System.out.println("Khac");
        }
    }

    @Override
    public void dongPhuc() {
        // ktra nv vi tri nao -> db -> dong phuc
        switch (this.type){
            case 1:
                if (this.gioiTinh == '1'){
                    System.out.println("Le tan nam phai mac vest den");
                }else if (this.gioiTinh == '0'){
                    System.out.println("Le tan nu phai mac ao dai");
                }else {
                    System.out.println("Khac");
                }
                break;
            case 2:
                System.out.println("Nhan vien phong ban thi mac lich su, tre trung, nang dong");
                break;
            case 3:
                System.out.println("Bao ve phai mac do bao ho lao dong");
                break;
            default:
                System.out.println("Khac");
        }
    }
}

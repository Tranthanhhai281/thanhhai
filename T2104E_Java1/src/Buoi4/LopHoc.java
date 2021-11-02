package Buoi4;

//1 mau / template de sinh ra nhieu lop hoc cu the
public class LopHoc {
    // bien
    //fields - bien instance : dac diem/ thuoc tinh cacdoi tuong -> khai bao
    //private: trong lop
    private String tenLop;
    //default: trong lop, cac class cung package
    int namHoc;
    //protected: trong lop, cac class cung package, cac lop con
    protected int soluongHv;
    //public: moi noi
    public String phongHoc;

    //method/ ham
    // < pham vi truy cap> < kieu tra ve cua ham> <ten ham> (<danh sach tham so>){ }
    // ham khoi tao - contructor
    //<ten ham> : ten class
    // <kieu tra ve cua ham> : khong co kieu tra ve
    public LopHoc(String name){
        tenLop = name;
    }
    private LopHoc(){

    }
    public LopHoc(String tenLop, int namHoc){
        // gan gia tri khoi tao cho cac fields
        this.tenLop = tenLop;
        this.namHoc = namHoc;
    }
    //overloadding: nap chong: cac ham cung 1 lop co cung ten ham, nhung khac nhau
    //ham tra ve doi tuong hien tai
    public LopHoc copy(){
        return this;
    }
    //get: tra ve gia tri cua thuoc tinh
    public String getTenLop(){
        return this.tenLop;
    }
    //set: gan gia tri cho thuoc tinh
    public void setTenLop(String tenLop){
        this.tenLop = tenLop;
    }
    public void xuat(){
        System.out.println("Ten Lop: " + this.tenLop
                + "; Nam Hoc: " + this.namHoc
                + "; SLHV: " + this.soluongHv
                + "; Phong Hoc: " + this.phongHoc);
    }
    public String getTT(){
        /*
        return "Ten Lop: " + this.tenLop
                + "; Nam Hoc: " + this.namHoc
                + "; SLHV: " + this.soluongHv
                + "; Phong Hoc: " + this.phongHoc;

         */
        String result = "";
        // nghiep vu
        result = String.format("Ten Lop: %s; nam hoc: %d; slhv: %d;phong hoc: %s%n",
                this.tenLop, this.namHoc, this.soluongHv, this.phongHoc);
        return result;
    }
    public static void main(String[] args){
        // tao doi tuong:
        LopHoc t2104e;   // t2104e: null: chua tham chieu, chua gan gia tri cu the
        //gan gia tri:
        // toan new: toan tu khoi tao
        t2104e = new LopHoc(); // t2104e: khac null: tham chieu/ gan gia tri cu the cac bien
        t2104e.tenLop = "T2104E";
        t2104e.namHoc = 2020;
        t2104e.soluongHv = 22;
        t2104e.phongHoc = "C10";
        t2104e.xuat();

        LopHoc t2103e = new LopHoc();
        t2103e.tenLop = "T2103E";
        t2103e.namHoc = 2021;
        t2103e.soluongHv = 16;
        t2103e.phongHoc = "C5";
        t2103e.xuat();

        LopHoc T2105E = t2104e.copy();
        System.out.println("t2104e: " + t2104e);
        System.out.println("T2105E: " + T2105E);
        T2105E = t2104e;
        System.out.println("T2105E: " + T2105E);
    }

}

package Buoi4;

public class MainBuoi4 {

    public static void main(String[] args){
        LopHoc t2102e = new LopHoc("T2104E");
        System.out.println("t2102e: Ten Lop: "
                + "; nam hoc: " + t2102e.namHoc
                + "; slhv: " + t2102e.soluongHv
                + "; phong hoc: " + t2102e.phongHoc);
        // t2102e.tenLop = "T2104"; // tenLop: private
        t2102e.namHoc = 2021;
        t2102e.soluongHv = 15;
        t2102e.phongHoc = "C1";
        t2102e.setTenLop("");
        System.out.println("t2102e: Ten Lop: "
                + "; nam hoc: " + t2102e.namHoc
                + "; slhv: " + t2102e.soluongHv
                + "; phong hoc: " + t2102e.phongHoc);
        t2102e.xuat();
        System.out.println("Ten lop moi: " + t2102e.getTenLop());
    }
}

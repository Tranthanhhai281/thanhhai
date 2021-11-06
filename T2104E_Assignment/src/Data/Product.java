package Data;

import DAO.IOperation;

import java.util.Scanner;

public class Product implements IOperation {
    private Category IdCate;
    private String IdPro;
    private String Barcode;
    private String NamePro;
    private String describe;
    private float importprice;
    private float price;

    public Product() {
    }

    public Product(Category idCate, String idPro, String barcode, String namePro, String describe, float importprice, float price) {
        this.IdCate = idCate;
        IdPro = idPro;
        Barcode = barcode;
        NamePro = namePro;
        this.describe = describe;
        this.importprice = importprice;
        this.price = price;
    }

    public Category getIdCate() {
        return IdCate;
    }

    public void setIdCate(Category idCate) {
        IdCate = idCate;
    }

    public String getIdPro() {
        return IdPro;
    }

    public void setIdPro(String idPro) {
        IdPro = idPro;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public String getNamePro() {
        return NamePro;
    }

    public void setNamePro(String namePro) {
        NamePro = namePro;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public float getImportprice() {
        return importprice;
    }

    public void setImportprice(float importprice) {
        this.importprice = importprice;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Nhap TT Product---");
        while (true) {
            System.out.println("Nhap ma Product: ");
            String IdPro = sc.nextLine();
            if (IdPro.length() != 8) {
                System.out.println("Ma san pham phai co 8 ky tu.");
            } else if (IdPro.replaceAll(" ", "").length() != IdPro.length()) {
                System.out.println("Ma san pham khong duoc co khoang trang.");
            }else {
                this.IdPro = IdPro;
            }
            if (this.IdPro != null) {
                break;
            }
        }
        System.out.println("Nhap Ma vach: ");
        this.Barcode = sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        this.NamePro = sc.nextLine();
        System.out.println("Nhap mo ta san pham: ");
        this.describe = sc.nextLine();
        while (true){
            System.out.println("Nhap gia mua: ");
            this.importprice = sc.nextFloat();
            if (this.importprice < 0)
                System.out.println("Nhap khong hop le.");
            break;
        }
        while (true){
            System.out.println("Nhap gia ban: ");
            this.price = sc.nextFloat();
            if (this.price < 0)
                System.out.println("Nhap khong hop le");
            break;
        }
    }

    @Override
    public void xuat() {
        System.out.println("Ma san pham:" + this.IdPro + "; ma vach:" + this.Barcode +
                "; ten san pham:" + this.NamePro + "; mo ta:" + this.describe +
                "; gia mua:" + this.importprice + "; gia ban:" + this.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "IdCate=" + IdCate +
                ", IdPro='" + IdPro + '\'' +
                ", Barcode='" + Barcode + '\'' +
                ", NamePro='" + NamePro + '\'' +
                ", describe='" + describe + '\'' +
                ", importprice=" + importprice +
                ", price=" + price +
                '}';
    }
}

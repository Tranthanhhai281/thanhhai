import DAO.CategoryDAO;
import DAO.OrderDAO;
import DAO.ProductDAO;
import Data.Category;
import Data.Order;
import Data.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("-----Chuong trinh quan ly ban hang-----");
        Scanner sc = new Scanner(System.in);
        String confirm = "";
        ProductDAO mathang = new ProductDAO();
        CategoryDAO nhomhang = new CategoryDAO();
        OrderDAO donhang = new OrderDAO();
        do {
            System.out.println("1.Crud Nhóm hàng.");
            System.out.println("2.Crud Sản phẩm.");
            System.out.println("3.Crud Đơn hàng.");
            System.out.println("4.Báo cáo.");
            System.out.println("5.Thoat.");

            System.out.println("Nhap lua chon (1-5):");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("---Crud Nhóm hàng---");
                    do {
                        System.out.println("1.Thêm 1 nhóm hàng mới.");
                        System.out.println("2.Hiển thị danh sách nhóm hàng.");
                        System.out.println("3.Tìm kiếm nhóm hàng.");
                        System.out.println("4.Thoat.");

                        System.out.println("Nhap lua chon (1-4):");
                        int choose1 = sc.nextInt();
                        switch (choose1) {
                            case 1:
                                System.out.println("1.Thêm 1 nhóm hàng mới.");
                                nhomhang.nhap();
                                break;
                            case 2:
                                System.out.println("2.Hiển thị danh sách nhóm hàng.");
                                nhomhang.xuat();
                                break;
                            case 3:
                                System.out.println("3.Tìm kiếm nhóm hàng.");
                                MainCase2(nhomhang);
                                break;
                            case 4:
                                System.out.println("4.Thoat");
                                break;
                            default:
                                System.out.println("Case khong hop le.");
                                break;
                        }
                        if (choose1 == 4) {
                            break;
                        }
                        sc.nextLine();

                        System.out.println("Ban co muon tiep tuc hay khong? (n: stop)");
                        confirm = sc.nextLine();
                    }while (!"n".equalsIgnoreCase(confirm));
                    break;
                case 2:
                    System.out.println("---Crud Sản phẩm---");
                    do {
                        System.out.println("1.Thêm 1 sản phẩm mới.");
                        System.out.println("2.Hiển thị danh sách sản phẩm.");
                        System.out.println("3.Tìm kiếm sản phẩm.");
                        System.out.println("4.Thoat.");

                        System.out.println("Nhap lua chon (1-4):");
                        int choose2 = sc.nextInt();
                        switch (choose2) {
                            case 1:
                                System.out.println("1.Thêm 1 sản phẩm mới.");
                                mathang.nhap();
                                break;
                            case 2:
                                System.out.println("2.Hiển thị danh sách sản phẩm.");
                                mathang.xuat();
                                break;
                            case 3:
                                System.out.println("3.Tìm kiếm sản phẩm.");
                                MainCase1(mathang);
                                break;
                            case 4:
                                System.out.println("4.Thoat");
                                break;
                            default:
                                System.out.println("Case khong hop le.");
                                break;
                        }
                        if (choose2 == 4) {
                            break;
                        }
                        sc.nextLine();

                        System.out.println("Ban co muon tiep tuc hay khong? (n: stop)");
                        confirm = sc.nextLine();
                    }while (!"n".equalsIgnoreCase(confirm));
                    break;
                case 3:
                    System.out.println("---Crud Đơn hàng---");
                    do {
                        System.out.println("1.Tạo 1 đơn hàng mới.");
                        System.out.println("2.Hiển thị danh sách đơn hàng.");
                        System.out.println("3.Thoat.");

                        System.out.println("Nhap lua chon (1-3):");
                        int choose3 = sc.nextInt();
                        switch (choose3) {
                            case 1:
                                System.out.println("1.Tạo 1 đơn hàng mới.");
                                donhang.nhap();
                                break;
                            case 2:
                                System.out.println("2.Hiển thị danh sách đơn hàng.");
                                donhang.xuat();
                                break;
                            case 3:
                                System.out.println("4.Thoat");
                                break;
                            default:
                                System.out.println("Case khong hop le.");
                                break;
                        }
                        if (choose3 == 3) {
                            break;
                        }
                        sc.nextLine();

                        System.out.println("Ban co muon tiep tuc hay khong? (n: stop)");
                        confirm = sc.nextLine();
                    }while (!"n".equalsIgnoreCase(confirm));
                    break;
                case 4:
                    System.out.println("---Báo cáo---");
                    do {
                        System.out.println("1.Hiển thị số lượng và tổng tiền sản phẩm bán hàng.");
                        System.out.println("2.Hiển thị top 3 sản phẩm bán chạy trong tháng.");
                        System.out.println("3.Thoat.");

                        System.out.println("Nhap lua chon (1-3):");
                        int choose4 = sc.nextInt();
                        switch (choose4) {
                            case 1:
                                System.out.println("1.Hiển thị số lượng và tổng tiền sản phẩm bán hàng.");
                                break;
                            case 2:
                                System.out.println("2.Hiển thị top 3 sản phẩm bán chạy trong tháng.");
                                break;
                            case 3:
                                System.out.println("4.Thoat");
                                break;
                            default:
                                System.out.println("Case khong hop le.");
                                break;
                        }
                        if (choose4 == 3) {
                            break;
                        }
                        sc.nextLine();

                        System.out.println("Ban co muon tiep tuc hay khong? (n: stop)");
                        confirm = sc.nextLine();
                    }while (!"n".equalsIgnoreCase(confirm));
                    break;
                case 5:
                    System.out.println("5.Thoat");
                    break;
                default:
                    System.out.println("Case khong hop le.");
                    break;
            }
            if (choose == 5) {
                break;
            }
            sc.nextLine();

            System.out.println("Ban co muon tiep tuc hay khong? (n: stop)");
            confirm = sc.nextLine();
        } while (!"n".equalsIgnoreCase(confirm));
    }

    public static void MainCase2(CategoryDAO category) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma Category can tim: ");
        String macate = sc.nextLine();

        int result = category.search(macate);
        if (result == -1) {
            System.out.println("Ma Category: "+ macate + " khong tim thay trong danh sach.");
        } else {
            System.out.println("Category can tim: "+ result);
        }
    }

    public static void MainCase1(ProductDAO product) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma Product can tim: ");
        String mapro = sc.nextLine();

        int result = product.search(mapro);
        if (result == -1) {
            System.out.println("Ma Product: "+ mapro + " khong tim thay trong danh sach.");
        } else {
            System.out.println("Product can tim: "+ result);
        }
    }
}


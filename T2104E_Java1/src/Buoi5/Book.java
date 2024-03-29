package Buoi5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Book{
    private String code;
    private String title;
    private Author author;
    private double price;
    private Date publishDate;
    private String category;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Book() {
        this.author = new Author();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void nhapBook(){
        System.out.println("Nhap book: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten sach: ");
        this.title = sc.nextLine();
        this.author.nhapAuthor();
        do {
            System.out.println("Ngay phat hanh (dd/MM/yyyy): ");
            try {
                this.publishDate = sdf.parse(sc.nextLine());
                // this.publishDate == null thi parse loi
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }while (this.publishDate == null);
        do {
            System.out.println("Gia: ");
            this.price = sc.nextDouble();
        }while (!(this.price >= 0));
        do {
            System.out.println("The loai (VH, TT, DL, KH, NT): ");
            this.category = sc.nextLine();
            // check category co dung dk VH, TT, DL, KH, NT
        } while (!this.checkCategory());
    }

    private boolean checkCategory(){
        String[] categories = {"VH, TT, DL, KH, NT"};
        for (String cate : categories){
            if (cate.equals(this.category)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", publishDate=" + publishDate +
                ", category='" + category + '\'' +
                '}';
    }
}

package Buoi5;

import java.util.Locale;
import java.util.Scanner;

/*
Viết class Book thông tin về sách gồm: tên sách (String), tác giả (Author), giá sách (double), thời gian xuất bản (Date), loại sách (String) ( chỉ hợp lệ 1 trong các giá trị: VH, TT, DL, KH, NT ).
Class Author thông tin về tác giả gồm: tên tác giả (String), email(String), năm sinh (int), giới tính (String) ( chỉ hợp lệ 3 giá trị M, F, 0).
Viết các hàm nhập thông tin từ bàn phím và xuất thông tin của đối tượng Book và Author ra màn hình.

 */
public class Author {
    //bien
    private String name;
    private String email;
    private int age;
    private String gender = "";

    public Author() {
    }

    public Author(String name, String email, int age, String gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender.equalsIgnoreCase("m")?"Nam"
                :(this.gender.equalsIgnoreCase("f")?"Nu"
                :"Khac");
    }

    public void setGender(String gender) {
        this.gender = gender.toUpperCase();
    }
    // nghiep vu
    public void nhapAuthor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tac gia: ");
        System.out.println("Ten: ");
        this.name = sc.nextLine();
        System.out.println("Email: ");
        this.email = sc.nextLine();
        while (this.age <= 0){
            System.out.println("Tuoi: ");
            this.age = sc.nextInt();
        }
        sc.nextLine();
        do {
            System.out.println("Gioi tinh (m: nam, f: nu, o: khac)");
            this.setGender(sc.nextLine());
        }while (!"m".equalsIgnoreCase(this.gender)
                && !"f".equalsIgnoreCase(this.gender)
                && !"o".equalsIgnoreCase(this.gender));
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age= " + age + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

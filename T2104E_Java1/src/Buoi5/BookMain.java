package Buoi5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookMain {

    public static void main(String[] args){
        //thoi gian hien tai
        Date now = new Date();
        System.out.println("now: " + now);
        // 14/10/2021
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //chuyen date -> string format
        System.out.println("now: " + sdf.format(now));
        //chuyen doi chuoi -> Date
        try {
            Date date1 = sdf.parse("14/10/2021");
            System.out.println("date1: " + date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        /*
        Author xuandieu = new Author();
        xuandieu.nhapAuthor();
        System.out.println("Thong tin tg Xuan Dieu: " + xuandieu.toString());

         */
        Book conan = new Book();
        conan.nhapBook();
        System.out.println("Sach conan: " + conan);
    }
}

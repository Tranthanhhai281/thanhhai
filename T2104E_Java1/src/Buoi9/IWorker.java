package Buoi9;
/*
* interface: truu tuong 100% -> khong tao duov doi tuong va khong chua cac thanh phan instance
* chua:
* + bien: final + static
* + ham: abstract ( chi khai bao khong co than ham)/static (co than ham thuoc pham vi tinh interface)
* tinh chat: 1 interface duoc ke thua nhieu interface
* + 1 class duoc ke thua 1 class va duoc thuc thi (implement) nhieu interface
 */
// hop dong cua nguoi lao dong
public interface IWorker {
    // bien
    final static String moTa = "Hop dong cua nguoi lao dong";
    // ham
    public static void descript(){
        System.out.println(moTa);
    }
    // ham abstract: khong co than ham, chi co khai bao
    void doWork();
}

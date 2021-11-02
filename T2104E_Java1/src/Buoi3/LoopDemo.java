package Buoi3;
/*
* while
* do while
* for
* for (for-each)
 */
public class LoopDemo {

    public static void main(String[] args){
        /*
        - khoi tao
        - dieu kien lap/dung lap
        - thay doi gia tri lap
         */
        //tinh tong 1 - 100, xem bn so chia het cho 7, tong cac so chia het cho 7
        // while

        int sum = 0, count7 = 0, sum7 = 0;
        // b1: khoi tao
        int num = 1;
        /*
        // lech lap:dk lap
        while (num <= 100){

            //khoi lap
            sum += num;
            if (num % 7 == 0){
                count7++;
                sum7 += num;
            }

            // b3: thay doi gia tri lap
            num++;
        }
        System.out.println("Tong: " + sum
                + "; So chia het cho 7: " + count7
                + "; Tong chia het cho 7: " + sum7);

         */

        /*
        for (num = 1; num <= 100; num++){
            sum += num;
            if (num % 7 == 0){
                count7++;
                sum7 +=num;
            }
        }
        System.out.println("Tong: " + sum
                + "; So chia het cho 7: " + count7
                + "; Tong chia het cho 7: " + sum7);

         */

        /*
        // do-while
        if(num <= 100){
            do{
                // khoi lap
                sum += num;
                if (num % 7 == 0){
                    count7++;
                    sum7 += num;
                }

                // b3: thay doi gia tri lap
                num ++;
            }while (num <= 100);
        }
        System.out.println("Tong: " + sum
                + "; So chia het cho 7: " + count7
                + "; Tong chia het cho 7: " + sum7);

         */

        /*
        // lap vo han
        while (true){
            // khoi lap
            sum += num;
            if (num % 7 == 0){
                count7++;
                sum7 += num;
            }
            // b2: dieu kien dung lap
            if (num == 100){
                break;
            }
            // b3: thay doi gia tri lap
            num++;
        }
        System.out.println("Tong: " + sum
                + "; So chia het cho 7: " + count7
                + "; Tong chia het cho 7: " + sum7);

         */

        //for vo han
        for(;;){
            //khoi lap
            sum += num;
            if(num % 7 == 0){
                count7++;
                sum7 += num;
            }
            // b2: dieu kien lap/ dung lap
            if (num == 100){
                break;
            }
            // b3: thay doi gia tri lap
            num++;
        }
        System.out.println("Tong: " + sum
                + "; So chia het cho 7: " + count7
                + "; Tong chia het cho 7: " + sum7);
    }
}

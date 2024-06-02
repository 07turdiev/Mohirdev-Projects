package Collections;

import java.util.Scanner;

public class UssdSurovlar {
    public static void main(String[] args){
        Scanner kiritish = new Scanner(System.in);
        int a;
        int b;
        int d;
        System.out.print("USSD so'rovni kriting: ");
        a= kiritish.nextInt();

        if (a == 100){
            System.out.println("Sizning balansingiz 20 000 usz." +
                    " Hohlasangiz 1 no bosib bonus olishingiz mumkun. " +
                    " 2 ni bosib Hizmatlarni o'chirishingiz mumkun: ");
            b = kiritish.nextInt();
            switch(b) {
                case 1:
                    System.out.println("Siz bonusga ega bo'ldingiz!");
                    break;
                case 2:
                    System.out.println("Hizmatlar o'chirildi!");
                    break;
                default:
                    System.out.println("Siz mavjud bo'lmagan raqam kiritdingiz!");

            }
            if (a == 105){
                        System.out.println("Al chiroq aksiyasiga hush kelibsiz " +
                                "Ulanish uchun 1 ni bosing. " +
                                "Hizmat haqida ma'lumot olish uchun 2 ni bosing");
                        d = kiritish.nextInt();
                        switch(d) {
                            case 1:
                                System.out.println("Al chiroq aksiyasiga uladingiz");
                                break;
                            case 2:
                                System.out.println("HHizmat haqida to'liq ma'lumotni Ucaal.uz saytidan oling!");
                                break;
                            default:
                                System.out.println("Siz mavjud bo'lmagan raqam kiritdingiz!");

                        }
                    }else {
                        System.out.println("Hato USSD so'rov");
                    }
        }else {
            if (a == 105){
                        System.out.println("Al chiroq aksiyasiga hush kelibsiz " +
                                "Ulanish uchun 1 ni bosing. " +
                                "Hizmat haqida ma'lumot olish uchun 2 ni bosing");
                        d = kiritish.nextInt();
                        switch(d) {
                            case 1:
                                System.out.println("Al chiroq aksiyasiga uladingiz");
                                break;
                            case 2:
                                System.out.println("HHizmat haqida to'liq ma'lumotni Ucaal.uz saytidan oling!");
                                break;
                            default:
                                System.out.println("Siz mavjud bo'lmagan raqam kiritdingiz!");

                        }
                    }else {
                        System.out.println("Hato USSD so'rov");
                    }
        }
    }
}

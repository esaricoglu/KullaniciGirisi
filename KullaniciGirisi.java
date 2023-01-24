package KosulluIfadelerveKodBlokları;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        userName = input.next();

        System.out.print("Şifre: ");
        password = input.next();

        if (userName.equals("Patika")) {
            if (password.equals("123456")) {
                System.out.println("Giriş Başarılı");
            } else {
                System.out.println("Yanlış şifre girdiniz.\n*Şifrenizi değiştirmek için 1'e basınız.\n*Çıkış yapmak için 2'ye basınız.");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Yeni şifrenizi giriniz: ");
                        String yeniSifre = input.next();

                        if (yeniSifre.equals("123456")) {
                            System.out.println("Yeni şifreniz eskisiyle aynı olamaz.");
                        } else {
                            System.out.println("Şifre değiştirme başarılı.");
                        }
                        break;
                    case 2:
                        System.out.println("Çıkış yapıldı.");
                        break;
                    default:
                        System.out.println("Tanımlanmayan bir seçim yaptınız.");
                }
            }
        } else {
            System.out.println("Böyle bir kullanıcı adı bulunmamaktadır.");
        }
    }
}

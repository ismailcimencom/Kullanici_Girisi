import java.util.Scanner;

public class Kullanici {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String username="info",pasword="123456";

        String kullanici_adi, sifre;
        System.out.println("Kullanıcı adını giriniz:");
        kullanici_adi=input.next();
        System.out.println("Şifrenizi giriniz:");
        sifre=input.next();

        if (username.equals(kullanici_adi) && pasword.equals(sifre))
        {
            System.out.println ("Sisteme başarıyla girildi!");
        }
        else
        {
            System.out.println ("Kullanıcı adı veya şifre yanlış!\n Sifrenizi sifirlamak istiyor musunuz?");
            sifre = input.next();
            if (pasword.equals(sifre) || pasword.equals("123456"))
            {
                System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz. ");
                sifre = input.next();
            }
            else
            {
                System.out.println("Sifre olusturuldu. ");
            }
        }
    }
}

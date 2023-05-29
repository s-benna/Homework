package day08StringManipulationMemoryUsageIfStatement;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        // * * * HOMEWORK * * *


        //Odev-1: Bir String variable olusturunuz ve bu String'de ki rakam olmayan tum karakterlerin sayisini console'a
        //   yazdiriniz.
        String odev1 = "Moss ile Oslo arasi 60km, Oslo Stavanger arasi 647 km'dir.";
        int a = odev1.replaceAll("[0-9]","").length();
        System.out.println("Odev-1: " + a);

        // Odev-2: Bir String variable olusturunuz ve ilk karakter ile son karakter disinda ki tum characterleri console'a
        // buyuk harflerle yazdiriniz.
        String b = "Svalbard dunyan'nin sonundadiR";
        String ılkHarf = b.substring(0,1).toLowerCase();
        String sonHarf = b.substring(b.length()-1).toLowerCase();
        String kalan = b.substring(1, b.length() - 1);
        String sonuc = kalan.toUpperCase();
        System.out.println("Odev-2: " +ılkHarf+sonuc+sonHarf);



        //Odev-3: Bir String variable olusturunuz ve bu String'de ki ilk ve son character'lerin ASCII degerleri toplamini
        //console yazdiriniz.
        String odev3 = "Bir String variable olusturunuz";
        char c1 = odev3.charAt(0);
        char c2 = odev3.charAt(odev3.length()-1);
        System.out.println("Odev-3: " +(c1+c2));

        //Odev-4: Tek kelimeli bi sehir ismi icin Strin Variable olusturun ve sehir isminin ilk harfini buyuk,
        //   diger harflerini kucuk harflerle yazdiriniz.
        String odev4 ="moss";
        String od4= odev4.substring(0,1).toUpperCase()+odev4.substring(1,4);
        System.out.println("Odev-4: " + od4);


        /*
        5- Asagida ki kurallara gore kullanicin girdigi password' u kontrol ediniz
               a- En az 6 character
               b- En az 1 tane buyuk harf olsun
               c- En az 1 tane kucuk harf olsun
               d- En az 1 tane rakam olsun
            Not-1: Once canli oturum sirasinda cozulen ornekleri yapiniz.
            Not-2: Tum sorulari dinamik kodlarla cozulmelidir.
            Not-3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir veya yardim isteyebilirsiniz.
         */

        Scanner sifre = new Scanner(System.in);
        System.out.println("Luften 6 haneli sifenizi giriniz.");
        String pass = sifre.nextLine();
        boolean a5 = pass.length()>5;
        boolean b5 = pass.replaceAll("[^A-Z]","").length()>0;
        boolean c5 = pass.replaceAll("[^a-z]","").length()>0;
        boolean d5 = pass.replaceAll("[^0-9]","").length()>0;

        System.out.println("Odev-5: " + (a5&&b5&&c5&&d5));

    }
}
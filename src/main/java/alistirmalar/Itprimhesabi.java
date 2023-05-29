package alistirmalar;

import java.util.Scanner;

public class Itprimhesabi {

    static int    tabanMaas;
    static int calismaSuresi;
    static char   unvan;
    static double prim;
    static Scanner maas = new Scanner(System.in);

    public static void main(String[] args) {

        //Bir IT firması çalışanlarına Kurban Bayramı öncesi
        //PRİM ve bayram İKRAMİYESİ verecektir.
        //     Ünvan olarak;
        //      Development (D),
        //      Tester (T),
        //      Software için (S)
        //      girilecektir.

        //     Kişinin Taban maaşı, tamsayı olarak girilecektir.
        //     Kaç yıldır bu IT firmasında çalıştığı Tamsayı olarak girilecektir.
        //     PRİM hesaplanırken ünvana bakılmaksızın, kişinin bu firmada kaç yıl çalıştığı baz alınacaktır,;
        //     5 ve daha az yıldır çalışanlara taban maaşının %10'u PRİM olarak verilecektir
        //     6 ve yukarı yıldır çalışanlara taban maaşının %15'i PRİM olarak verilecektir.
        //     İKRAMİYE hesaplanırken kişinin ÜNVANI'na göre hesaplama yapılacaktır.
        //     DEVELOPMENT ise; Taban Maaşı ve Prim toplamının % 7'si İKRAMİYE olarak verilecektir.
        //     TESTER ise; Taban Maaşı ve Prim toplamının % 6'sı İKRAMİYE olarak verilecektir.
        //     SOFTWARE ise; Taban Maaşı ve Prim toplamının % 5'i İKRAMİYE olarak verilecektir.

        //     Bu verilere göre; TABAN MAAŞI, ÇALIŞTIĞI YIL ve ÜNVAN'ı girilen kişinin PRİM ve İKRAMİYESİNİ bulunuz...

        System.out.println("Lutfen calisma surenizi giriniz..");
        calismaSuresi = maas.nextInt();

        System.out.println("Lutfen Maasinizi giriniz..");
        tabanMaas = maas.nextInt();

        if (calismaSuresi<=5){
            prim = tabanMaas*0.1;
        } else if (calismaSuresi > 5) {
            prim = tabanMaas*0.15;
        }

        System.out.println("Lutfen unvan giriniz..");
        unvan = maas.next().toUpperCase().charAt(0);

        if (unvan == 'D'){
            double developer = (tabanMaas + prim)*0.07;
            System.out.println("Developer: "+ (developer+tabanMaas));
        } else if (unvan == 'T') {
            double tester = (tabanMaas + prim)*0.06;
            System.out.println("Tester: "+ (tester+tabanMaas));
        } else if (unvan == 'S') {
            double software = (tabanMaas + prim)*0.05;
            System.out.println("Software: "+(software+tabanMaas));
            } else {
            System.out.println("Lutfen Gecerli Unvan Giriniz..");
        }



    }//main
}//class

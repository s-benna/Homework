package day04scannerwrapper;

import java.util.Scanner;
        /*
        Homework
        1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        ornegin => 3,5,7 icin ortalama (3+5+7)/3=5

        2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        ornegin => 312 icin 3+1+2=6
        */
public class Homework04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir sayi yaziniz...");//Kullaniciyi yonlendir . . .

        int number = input.nextInt(); //Girilen sayi kaydedildi.

        int birlerBasamagi = number%10; // Onlar basamagi alindi.

        number=number/10;

        int onlarBasamagi=number%10;

        number=number/10;

        int yuzlerBasamagi=number%10;

        System.out.println("Verilen sayinin Ortalamasi: " + (yuzlerBasamagi+onlarBasamagi+birlerBasamagi)/3);

        System.out.println("Verilen sayinin rakamlari toplami: " + (yuzlerBasamagi+onlarBasamagi+birlerBasamagi));


        System.out.println("lutfen 1. sayiyi giriniz.");

        int sayi1 = input.nextInt();

        System.out.println("Lutfen 2. sayiyi giriniz.");

        int sayi2 = input.nextInt();

        System.out.println("Lutfen 3.rakami giriniz.");

        int sayi3= input.nextInt();

        System.out.println("Verdiginiz 3 sayinin ortalmasi: " + (sayi3+sayi2+sayi1)/3);
    }//main
}//class

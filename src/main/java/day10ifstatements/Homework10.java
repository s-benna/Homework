package day10ifstatements;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        //1) Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden,
        //   kullaniciya uygun mesaj veren kodu yaziniz.

        System.out.println("! ! Parola giriniz ! !");
        Scanner odev1 = new Scanner(System.in);
        String pass = odev1.nextLine();

        String p1 ="pwd123!";
        if (pass.equals("pwd123!")){
            System.out.println("Girdiginiz parola dogru...");
        }
        else {
            System.out.println("Parolaniz yanlis lutfen tekrar deneyiniz...");
        }

        //2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz

        System.out.println("Lutfen Turkce - Ingilizce - Norvecce bir gun adi Giriniz.....");
        Scanner dayName = new Scanner(System.in);
        String dag = dayName.nextLine();

        String day1 = "Mandag";
        String day2 = "Trisdag";
        String day3 = "Onsdag";
        String day4 = "Torsdag";
        String day5 = "Fredag";
        String day6 = "Lørdag";
        String day7 = "Søndag";

        String daytr1 = "Pazartesi";
        String daytr2 = "Sali";
        String daytr3 = "Carsamba";
        String daytr4 = "Persembe";
        String daytr5 = "Cuma";
        String daytr6 = "Cumartesi";
        String daytr7 = "Pazar";

        String dayeng1 = "Monday";
        String dayeng2 = "Tuesday";
        String dayeng3 = "Wednesday";
        String dayeng4 = "thursday";
        String dayeng5 = "Friday";
        String dayeng6 = "Saturday";
        String dayeng7 = "Sunday";

        if (dag.equalsIgnoreCase(day1) || dag.equalsIgnoreCase(daytr1) || dag.equalsIgnoreCase(dayeng1)){
            System.out.println("Haftanin 1. Gunu");
        } else if (dag.equalsIgnoreCase(day2) || dag.equalsIgnoreCase(daytr2) || dag.equalsIgnoreCase(dayeng2)) {
            System.out.println("Haftanin 2. Gunu");
        }
        else if (dag.equalsIgnoreCase(day3) || dag.equalsIgnoreCase(daytr3) || dag.equalsIgnoreCase(dayeng3)) {
            System.out.println("Haftanin 3. Gunu");
        }
        else if (dag.equalsIgnoreCase(day4) || dag.equalsIgnoreCase(daytr4) || dag.equalsIgnoreCase(dayeng4)) {
            System.out.println("Haftanin 4. Gunu");
        }
        else if (dag.equalsIgnoreCase(day5) || dag.equalsIgnoreCase(daytr5) || dag.equalsIgnoreCase(dayeng5)) {
            System.out.println("Haftanin 5. Gunu");
        }
        else if (dag.equalsIgnoreCase(day6) || dag.equalsIgnoreCase(daytr6) || dag.equalsIgnoreCase(dayeng6)) {
            System.out.println("Haftanin 6. Gunu");
        }
        else if (dag.equalsIgnoreCase(day7) || dag.equalsIgnoreCase(daytr7) || dag.equalsIgnoreCase(dayeng7)) {
            System.out.println("Omurden 1 hafta daha bitti...");
        }
        else {
            System.out.println("....TEKRAR DENEYINIZ....");
        }


           //3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz ==== 1>January, 2> February
        System.out.println("Kacinci ayda oldugunuz belirtiniz...");

            Scanner odev3 = new Scanner(System.in);
            byte aySayisi = odev3.nextByte();


            if (aySayisi>12 || aySayisi<0){
                System.out.println("Lutfen 1 ile 12 arasi sayi girin!!!");
            } else if (aySayisi==1) {
                System.out.println("Ocak ayindasiniz..");

            }
            else if (aySayisi==2) {
                System.out.println("Subat ayindasiniz..");

            }
            else if (aySayisi==3) {
                System.out.println("Mart ayindasiniz..");

            }
            else if (aySayisi==4) {
                System.out.println("Nisan ayindasiniz..");

            }
            else if (aySayisi==5) {
                System.out.println("Mayis ayindasiniz..");

            }
            else if (aySayisi==6) {
                System.out.println("Haziran ayindasiniz..");

            }
            else if (aySayisi==7) {
                System.out.println("Temmuz ayindasiniz..");

            }
            else if (aySayisi==8) {
                System.out.println("Agustos ayindasiniz..");

            }
            else if (aySayisi==9) {
                System.out.println("Eylul ayindasiniz..");

            }
            else if (aySayisi==10) {
                System.out.println("Ekim ayindasiniz..");

            }
            else if (aySayisi==11) {
                System.out.println("Kasim ayindasiniz..");

            }
            else if (aySayisi==12) {
                System.out.println("Aralik ayindasiniz..");

            }




    }//main
}//class

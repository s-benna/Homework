package day03methodobjectcreationscanner;

public class Homework1 {
    public static void main(String[] args) {
        double r = 6;
        daireCevresi((int) r);

        double r1 = 4;
        daireninAlani(r1);
    }

    private static void daireninAlani(double r1) {System.out.println("Dairenin alani: " + r1*r1*3.14);}
    private static void daireCevresi(int r) {System.out.println("Cemberin cevresi: " +2*r*3.14);}

}

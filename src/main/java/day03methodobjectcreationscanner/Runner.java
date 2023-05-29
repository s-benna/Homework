package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {

        Ogretmen odev = new Ogretmen();

        System.out.println("Ogretmenin Adi ve Soyadi: " + odev.ogretmenAdi + "\nYasi: " + odev.yas + "\nCinsiyet: " + odev.cinsiyet);

        System.out.println("Sicil numarasi: " + odev.sicilNumarasi + "\nGorevde mi?: "+ odev.gorevdeAktifMi + "\nTurkce derslerine girer: " + odev.alaniTurkceMi);

        System.out.println("Odev: " + odev.verdigiOdev);

        odev.derssaati();
        odev.mentor();
        

    }//main
}//class

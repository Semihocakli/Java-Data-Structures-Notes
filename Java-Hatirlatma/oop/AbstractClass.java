package oop;

// Soyut sınıf
abstract class Hayvan {
    // Soyut metod (tamamlanmamış)
    abstract void sesCikar();

    // Somut metod (tamamlanmış)
    void yemekYe() {
        System.out.println("Hayvan yemek yiyor...");
    }
}

// Alt sınıflar soyut metodları doldurmalı
class Kedi extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Kedi miyavlıyor...");
    }
}

class Kopek extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Köpek havlıyor...");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Hayvan kedi = new Kedi();
        Hayvan kopek = new Kopek();

        kedi.sesCikar();  // Kedi miyavlıyor...
        kopek.sesCikar(); // Köpek havlıyor...
        kedi.yemekYe();   // Hayvan yemek yiyor...
    }
}


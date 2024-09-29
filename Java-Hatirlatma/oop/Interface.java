package oop;

// Arayüz
interface Ucan {
    void uc();
}

// Arayüz
interface Kosan {
    void kos();
}

// Bir sınıf birden fazla arayüzü implemente edebilir
class Kartal implements Ucan, Kosan {
    @Override
    public void uc() {
        System.out.println("Kartal uçuyor...");
    }
    @Override
    public void kos() {
        System.out.println("Kartal koşuyor...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Kartal kartal = new Kartal();
        kartal.uc();  // Kartal uçuyor...
        kartal.kos(); // Kartal koşuyor...
    }
    /* ÇIKTI:
    Kartal uçuyor...
    Kartal koşuyor...
     */
}

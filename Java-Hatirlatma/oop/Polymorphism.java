package oop;

public class Polymorphism {
    // İki sayıyı toplar
    int topla(int a, int b) {
        return a + b;
    }

    // Üç sayıyı toplar (aynı isimde, farklı parametre)
    int topla(int a, int b, int c) {
        return a + b + c;
    }

    // İki ondalıklı sayıyı toplar (aynı isim, farklı veri tipi)
    double topla(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Polymorphism hesap = new Polymorphism();

        // Farklı parametrelerle aynı metot ismi kullanılır
        System.out.println(hesap.topla(5, 10));        // 15
        System.out.println(hesap.topla(5, 10, 15));    // 30
        System.out.println(hesap.topla(5.5, 4.5));     // 10.0
    }
}


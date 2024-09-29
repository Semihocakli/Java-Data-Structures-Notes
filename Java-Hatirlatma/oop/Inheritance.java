package oop;

public class Inheritance {
    int hiz;
    String renk;

    void hizlan() {
        hiz += 10;
        System.out.println("Araç hızlandı: " + hiz + " km/h");
    }
}

// Alt sınıf
class Araba extends Inheritance {
    String model;

    void modelBelirt(String model) {
        this.model = model;
        System.out.println("Araba modeli: " + model);
    }

    public static void main(String[] args) {
        // Araba nesnesi oluşturma (alt sınıf)
        Araba benimArabam = new Araba();

        // Üst sınıftan miras alınan metotların ve özelliklerin kullanımı
        benimArabam.hiz = 50;           // Üst sınıf özelliği
        benimArabam.renk = "Kırmızı";   // Üst sınıf özelliği
        benimArabam.hizlan();           // Üst sınıf metodu

        // Alt sınıfa ait metot ve özellikler
        benimArabam.modelBelirt("BMW"); // Alt sınıfa ait metot
    }
    /* ÇIKTI:
    Araç hızlandı: 60 km/h
    Araba modeli: BMW
     */
}

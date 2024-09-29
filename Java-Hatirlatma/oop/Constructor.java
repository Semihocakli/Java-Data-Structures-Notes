package oop;

public class Constructor {
    String model;
    int yil;
// Sınıf ile Aynı İsim: Constructor'ın ismi, sınıfın adıyla aynı olmak zorundadır. İlk Çağrılan Method.
    // Constructor
    public Constructor(String model, int yil) {
        this.model = model;
        this.yil = yil;
    }

    public void bilgileriGoster() {
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }

    public static void main(String[] args) {
        // Yeni bir Araba nesnesi oluşturuluyor
        Constructor araba1 = new Constructor("Toyota", 2020);
        araba1.bilgileriGoster();
    }
}

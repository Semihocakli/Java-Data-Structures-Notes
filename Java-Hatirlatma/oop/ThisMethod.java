package oop;

public class ThisMethod {
    String renk;
    int hiz;

    // Constructor (Yapıcı metod)
    public ThisMethod(String renk, int hiz) {
        // this.renk ifadesi, sınıfın örnek değişkenini temsil eder.
        // Parametre adı ile örnek değişkenin adı aynı olduğunda, this kullanılarak ayırt edilir.
        this.renk = renk;
        this.hiz = hiz;
    }

    // Arabanın bilgilerini yazdıran metod
    public void arabaBilgileri() {
        System.out.println("Arabanın rengi: " + this.renk);
        System.out.println("Arabanın hızı: " + this.hiz + " km/s");
    }
    public static void main(String[] args) {
        // Araba nesnesi oluşturma
        ThisMethod benimArabam = new ThisMethod("Kırmızı", 120);

        // Arabanın bilgilerini ekrana yazdırma
        benimArabam.arabaBilgileri();
    }
}

package JavaTutorial;

public class Fonksiyonlar {
    /* Erisim Belirleyici Ekstra Özellik veriTipi metotAdi(parametre1, parametre2, ....) {
        kod bloğu
    }
------------------------------------------------------------------------------------------------------------------
     # 1. Erişim Belirleyici
      * public: Metot her yerden erişilebilir.
      * private: Metot yalnızca tanımlandığı sınıf içinden erişilebilir.

      # 2. Ekstra Özellikler
       * static: Metot sınıfa ait olur, bir nesne oluşturulmasına gerek kalmadan sınıf adıyla çağrılabilir.
       * final: Metot alt sınıflarda override edilemez.
       * abstract: Metodun gövdesi yoktur ve alt sınıflar tarafından implement edilmelidir (yalnızca abstract sınıflarda kullanılır).

      # 3. Donüs Tipi
       * int, double, float, char, boolean: Temel veri türleri dönebilir.
       * void: Hiçbir değer döndürmez.

       Metod Değişkenleri               -------------      Nesne Değişkenleri
* Değişkenleri kullanmak için ilk değer atamaları       * İlk değerler atanmazsa ilkel tipler için default
yapılmak zorundadır.                                   değerler, nesne tipleri için null referans alırlar.

* Sadece metod içerisinden erişilebilirler.              * Nesne oldukça ve izinler dahilinde dışarıdan
                                                        erişebilirler.
------------------------------------------------------------------------------------------------------------------
    */

    public static void main(String[] args) {
        int toplam = Topla(3,4); // Toplam Fonksiyonu cagirma
        System.out.println("Toplam Fonksiyonu = " + toplam);

        Cikart(5,3); // Cikartma fonksiyonu cagirma

        Hesaplama(5,2,3); // Hesaplama fonksiyonu cagirma
    }
    static int Topla(int x,int y) {
        return x + y;
    }
    static void Cikart(int x, int y) {
        System.out.println("Cikartma Fonksiyonu = " + (x-y));
    }
    public static void Hesaplama(int x, int y, int z) {
        System.out.println("Toplamları = "+ (x + y + z));
    }


}

package JavaTutorial;

import java.util.Scanner;
public class Diziler {
    public static void main(String[] args) {

        /*
*Aslında farketmesekte uygulama içerisinde collection framework gibi bir çok yapı diziler ile
tasarlanmıştır. Yani List kullanan her şey alt tarafta diziyi de kullanır.

* Örnek Kullanımlar - Atama Bekleyen JavaTutorial.Diziler

    int[] diziBir = new int[6];
    double[] diziIki = new double[10];
    String[] diziUc = new String[2];
    Ogrenci[] diziDort = new Ogrenci[8];

* Örnek Kullanımlar - Ataması Yapılmış JavaTutorial.Diziler

    String[] sehirler = {"Ankara", "İstanbul", "İzmir", "Balıkesir"};
    int[] sayilar = {10, 20, 30, 40, 50}; int boyut = sayilar.length;  // 5

    * Dizi Elemanlarını Yazdırma
        for (int i = 0; i < sayilar.length; i++) {
    System.out.println(sayilar[i]);}

* Çok Boyutlu JavaTutorial.Diziler

    String[][] ikiBoyutluDizi = new String[4][2];
    int[][][] ucBoyutluDizi = new int[2][8][4];
    Ogrenci[][][][] dortBoyutluDizi = new Ogrenci[2][6][4][6];

    * Örnek Kullanımlar

    int[][] matris = new int[3][4];  // 3 satır, 4 sütunlu matris
    // Başlatma
    int[][] matris = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}  };

    String[][] sehirler = { {"Istanbul", "Edirne" },
                            {"Izmir", "Aydın" },
                            {"Ankara", "Konya" } };


         */
        /*
-----------------------------------------------------------------------------------------------
        ####### Döngü Alıştırmaları #######
-----------------------------------------------------------------------------------------------

        String[][] sehirler = new String[3][2];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Edirne";
        sehirler[1][0] = "İzmir";
        sehirler[1][1] = "Aydın";
        sehirler[2][0] = "Ankara";
        sehirler[2][1] = "Konya";
        for (int i = 0; i < sehirler.length; i++) {
            for (int j = 0; j < sehirler[i].length; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
-----------------------------------------------------------------------------------------------
        int[][] matris = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // Matrisin elemanlarını yazdırma
        for (int i = 0; i < matris.length; i++) {  // Satırları dolaşır
            for (int j = 0; j < matris[i].length; j++) {  // Sütunları dolaşır
                System.out.print(matris[i][j] + " ");  // Yan yana yazdırma
            }
            System.out.println();  // Bir satır tamamlandığında alt satıra geç
        }
        // matris.length: Matrisin satır sayısını verir.
        // matris[i].length: Her satırdaki sütun sayısını verir.

-----------------------------------------------------------------------------------------------
* JavaTutorial.Diziler için uzunluk artırma, kopyalama ve sıralama gibi operasyonlar için Collections Framewor
bölümü içerisinde geçen Arrays sınıfını inceleyebilirsiniz.
         */
    }
}

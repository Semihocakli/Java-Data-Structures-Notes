package JavaTutorial;

import java.util.Scanner;
public class Donguler {
    public static void main(String[] args) {

    /*
    1 .) For Dongüsü

    for ( baslangic ; kosul ; dongu_adimi ) {
         kod blogu }

        for (int i = 0; i < 10; i++) {
            System.out.print("\t i :" + i);
            // output: i :0	 i :1	 i :2	 i :3	 i :4	 i :5	 i :6	 i :7	 i :8	 i :9
        }
    ------------------------------------------------------------------------------------------------
    2 .) İç içe For Döngüsü

        for (int i = 1; i <= 5; i++) {   // Dış döngü: Satırlar
            for (int j = 1; j <= 5; j++) {   // İç döngü: Sütunlar
                System.out.print(i + "," + j + "  ");  // Satır ve sütun numaralarını yazdır
            }
            System.out.println();  // Her satırın sonunda bir alt satıra geç
        }
       output:  1,1  1,2  1,3  1,4  1,5
                2,1  2,2  2,3  2,4  2,5
                3,1  3,2  3,3  3,4  3,5
                4,1  4,2  4,3  4,4  4,5
                5,1  5,2  5,3  5,4  5,5
    ------------------------------------------------------------------------------------------------
    3. ) While Döngüsü

        while ( koşul ) { // Koşul doğru olduğu sürece devam
            Çalıştırılacak kod bloğu  }

        int i = 0;
        while (i < 10) {
            System.out.print("\t i : " + i++);
            // output : i : 0	 i : 1	 i : 2	 i : 3	 i : 4	 i : 5	 i : 6	 i : 7	 i : 8	 i : 9
        }

     */
        /*
------------------------------------------------------------------------------------------------
        ##########  Döngü Alıştırmaları  ##########
------------------------------------------------------------------------------------------------

 1. )  1-30 arasındaki tek sayıları yazdıran programı yazınız

        for (int i=1; i < 30; i+=2){
            System.out.println(i);
        }
 ------------------------------------------------------------------------------------------------
 2. ) Girilen 5 Sayının Toplamını ve ortalamasını Bulan programı yazınız.

        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int ortalama = 0;
        int sayilar;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". Sayiyi giriniz: ");
            sayilar = input.nextInt();
            toplam += sayilar;
            ortalama = toplam/sayilar;
        }
        System.out.println("Toplam: "+ toplam + " Ortalama: "+ ortalama);

 ------------------------------------------------------------------------------------------------
 3. ) Girilen 6 sayıdan Tek ve Çift Sayıların Ortalamasını Hesaplattırarak ekrana yazdıran uygulamayı yazınız.

        Scanner input = new Scanner(System.in);
        int sayilar;
        int tek_Sayilar=0, toplam_tek=0;
        int cif_sayilar=0, toplam_cift=0;

        for(int i=1; i<=6; i++){
            System.out.print(i + ". Sayiyi giriniz: ");
            sayilar = input.nextInt();

            if (sayilar % 2 == 0){
                cif_sayilar +=1;
                toplam_cift += sayilar;
            }
            else {
                tek_Sayilar +=1;
                toplam_tek += sayilar;
            }
        }
        if (cif_sayilar > 0){
            int ortalama_cift = (toplam_cift / cif_sayilar);
            System.out.println("Çift sayıların Ortalamasi: "+ ortalama_cift);
        }
        else {
            System.out.println("Cift Sayi Girilmedi");
        }
        if (tek_Sayilar > 0){
            int ortalama_tek = (toplam_tek / tek_Sayilar);
            System.out.println("Tek sayıların Ortalamasi: "+ ortalama_tek);
        }
        else {
            System.out.println(" Tek Sayi Girilmedi");
        }
 ------------------------------------------------------------------------------------------------
 4. ) iç içe For Döngüsü kullanarak 1′ den 10′ akadar çarpım tablosu oluşturunuz. (Yanyana çıktı veren versiyonunuda deneyiniz)


        for(int i = 1; i<=10; i++){
            for (int a =1 ; a<=10; a++){
                //System.out.print(i + "*" + a + " = " + (i*a));
                System.out.print(i + "*" + a + "=" + (i * a) + "\t");
            }
            System.out.println();
        }
------------------------------------------------------------------------------------------------
5.)Kullanıcıdan 2 kez aynı parolayı girmesini isteyerek, iki defa aynı parola girildiğinde giriş yapan farklı girildiğinde uyaran kodları oluşturun(while ie)

        Scanner input = new Scanner(System.in);
        int parola1 = input.nextInt();
        int parola2 = input.nextInt();

        while (parola1 != parola2) {
            System.out.println("Girdiğiniz parolalar eşleşmiyor. Tekrar deneyin.");
            parola1 = input.nextInt();
            parola2 = input.nextInt();
        }
        System.out.println("Parolalar eşleşti. Giriş başarılı!");
------------------------------------------------------------------------------------------------
6 .) "*" kullanarak kullanıcının belirlediği ölçülerde bir dikdörtgen oluşturunuz.

        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int satir = input.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int sutun = input.nextInt();

        for(int i = 1; i<=satir;i++){
            for(int j = 1; j<=sutun;j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
------------------------------------------------------------------------------------------------
7 .) Kullanıcıdan 5 sayı girmesini ve girilen sayıların faktöriyel değerlerini toplamasını isteyinizisteyiniz.
negatif bir sayı girildiğinde sayı isteme işlemini bitirerek girilen toplam sayı adetini ve elde edilen toplamı kullanıcıya yazdırırken,
7 ve katları sayılar girildiğinde gerekli hesaplamaları yapmayarak devam eden uygulamayı yazınız.


        Scanner input = new Scanner(System.in);
        int toplam = 0, sayac =0, carpim =1;

        while (sayac < 5){
            sayac +=1;
            System.out.println(sayac+"."+ " Sayıyı giriniz: ");
            int sayilar = input.nextInt();

            if (sayilar < 0){
            break;}

            if (sayilar % 7 == 0) {
                System.out.print("Bu sayıyı Hesaplayamıyoruz");
                continue;
            }
            for(int i = 1; i<=sayilar; i++) {
                carpim *= i;
            }
        }
        toplam += carpim;
        System.out.println("Toplam = " + toplam);
        System.out.println("Toplam Sayi Adedi = "+ sayac);

------------------------------------------------------------------------------------------------
8. )

         */

    }
}

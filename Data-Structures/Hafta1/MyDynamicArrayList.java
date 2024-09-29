package Hafta1;

public class MyDynamicArrayList {
    int dizi[];
    int elemansayisi;
    int dizi_kapasitesi;

    // Constructor
    public MyDynamicArrayList() {
        dizi_kapasitesi = 1;
        dizi = new int[dizi_kapasitesi];
        elemansayisi = 0;
    }
    public int ToplamElamanSayisi() { return elemansayisi; }
    public int IlkIndeks(){ return dizi[0]; }
    public int SonIndeks() { return dizi[elemansayisi-1]; }


    public int ElemanGetir(int index) {
        if (index >= 0 && index < elemansayisi) {
            return dizi[index];
        } else {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }
    }
    public void ElemanEkle(int eleman) {
        if (elemansayisi == dizi_kapasitesi) { // Eğer kapasite dolu ise kapasiteyi 2 katına çıkar
            BoyutArttir();
        }
        dizi[elemansayisi] = eleman;
        elemansayisi += 1;
    }
    public void BoyutArttir() {
        dizi_kapasitesi = dizi_kapasitesi * 2;
        int yeni_dizi[] = new int[dizi_kapasitesi];

        for (int i = 0; i < elemansayisi; i++) { // Mevcut elemanları yeni diziye kopyala
            yeni_dizi[i] = dizi[i];
        }
        dizi = yeni_dizi;  // Eski diziyi yeni dizi ile değiştir
    }

    public void ElemanCikar(int index) {
        if (index >= 0 && index < elemansayisi) {
            for (int i = index; i < elemansayisi - 1; i++) {  // Eleman çıkarıldıktan sonra dizideki elemanları sola kaydır
                dizi[i] = dizi[i + 1];
            }
            elemansayisi -= 1;  // Eleman sayısını azalt
            dizi[elemansayisi] = 0;  // Çıkarılan elemanı temizle
        }
    }

    public static void main(String[] args) {
        MyDynamicArrayList myList = new MyDynamicArrayList();

        myList.ElemanEkle(10);
        myList.ElemanEkle(20);
        myList.ElemanEkle(30);
        myList.ElemanEkle(40);

        System.out.println("Toplam Eleman Sayısı: " + myList.ToplamElamanSayisi());
        System.out.println("İlk indeks: "+ myList.IlkIndeks());
        System.out.println("Son indeks: "+ myList.SonIndeks());

        for (int i = 0; i < myList.ToplamElamanSayisi(); i++) {
            System.out.println("Eleman " + i + ": " + myList.ElemanGetir(i));
        }

        myList.ElemanCikar(1);
        System.out.println("\nEleman Çıkarıldıktan Sonra:");
        System.out.println("Toplam Eleman Sayısı: " + myList.ToplamElamanSayisi());
        for (int i = 0; i < myList.ToplamElamanSayisi(); i++) {
            System.out.println("Eleman " + i + ": " + myList.ElemanGetir(i));
        }
    }
}

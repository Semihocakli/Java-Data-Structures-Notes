package Hafta1;
/*
ArrayList :
Normal diziye ona kaç eleman saklayacağını önceden söyleriz ama
sabit uzunlukta bir dizi yerine dinamik bir diziye ihtiyacımız olduğunda genişleyebilir ve yeni elemanlar eklenebilir.
 */
public class MyArrayListV2 {
    private int[] array;  // Diziyi tutacak olan yapı
    private int size;     // Listedeki mevcut eleman sayısı
    private int capacity; // Dizinin maksimum kapasitesi

    // Varsayılan başlangıç kapasitesi ile oluşturucu
    public MyArrayListV2() {
        capacity = 10;  // Başlangıç kapasitesi
        array = new int[capacity];
        size = 0;       // Başlangıçta liste boş
    }

    // Eleman ekleme (liste sonuna)
    public void add(int element) {
        if (size == capacity) {
            growArray(); // Eğer kapasite dolduysa diziyi genişlet
        }
        array[size] = element; // Elemanı ekle
        size++;                // Eleman sayısını artır
    }

    // Belirli bir indeksteki elemanı döndürme
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }
        return array[index];
    }

    // Listedeki eleman sayısını döndürme
    public int size() {
        return size;
    }

    // Diziyi genişleten yardımcı metod
    private void growArray() {
        capacity *= 2;  // Kapasiteyi iki katına çıkar
        int[] newArray = new int[capacity]; // Yeni kapasiteye sahip dizi
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i]; // Eski diziyi yeni diziye kopyala
        }
        array = newArray; // Yeni diziyi mevcut dizi yap
    }

    // Belirli bir indeksten eleman çıkarma
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1]; // Elemanları sola kaydır
        }
        size--; // Eleman sayısını azalt
    }

    // Dizinin elemanlarını yazdırma
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();

        // Listeye eleman ekleme
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Listeyi yazdırma
        System.out.print("Liste elemanları: ");
        list.print();

        // İndeksten eleman alma
        System.out.println("2. indeksteki eleman: " + list.get(2));

        // Eleman çıkarma
        list.remove(1);
        System.out.print("Eleman çıkarıldıktan sonra: ");
        list.print();
    }
}


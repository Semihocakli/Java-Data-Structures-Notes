package Hafta1;
/*
ArrayList’i bir not defteri gibi düşün. Başlangıçta defterde 10 sayfa var (kapasite 10 eleman).
10 sayfayı yazdın diyelim. Daha fazla yazmak istediğinde, not defterinin sayfaları dolduğundan bir şey yazamazsın.
Ama ArrayList gibi bir defterin olsaydı, bir düğmeye bastığında defterin içine 10 tane daha sayfa eklenirdi!
Yani her yeni sayfa eklemeye devam edebilirdin.
 */
public class MyArrayList {
    int arr[];
    int arraysize; // dizinin mevcut boyutu hakkında
    int elementNumber; // dizideki eleman sayıları

    public MyArrayList() {
        arr = new int[3];
        arraysize = 3;
        elementNumber = 0;
    }

    public void add(int number) {
        if (this.elementNumber == this.arraysize) { // eğer dizideki eleman sayısı, dizinin mevcut boyutuna ulaşırsa:

            int temp[] = new int[this.arraysize * 2]; // Dizi boyutunu büyüt

            for (int i = 0; i < this.arraysize; i++) {
                temp[i] = this.arr[i];  // Dizi elemanlarını yeni diziye kopyala
            }

            this.arr = temp; // Yeni diziyi arr ile gösterme
            arraysize = arraysize * 2; // boyut arttırma
            temp = null; // Geçici diziyi null yapma
        }
        arr[elementNumber] = number; // yeni elemanı dizideki ilk boş alana ekleriz
        elementNumber++; // dizideki eleman sayısı 1 arrtırırız.

        this.printArray();
    }
    public void remove(int index) {

        // indisteki elemanı kaldırır ve dizideki kalan elemanları sola kaydırır
        for (int i = index; i < elementNumber - 1; i++) {
            arr[i] = arr[i + 1]; // her elemanı bi önceki indise tasıma
        }

        arr[elementNumber - 1] = 0; // Son elemanı sıfırla
        elementNumber--; // eleman sayısını azaltma

        this.printArray();
    }
    public int length(){
        return elementNumber;
    }
    public int first(){
        return arr[0];
    }
    public int last() {
        return arr[elementNumber-1];
    }
    public void printArray() {
        for (int i = 0; i < elementNumber; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);

        myArrayList.remove(2); // 30'u kaldırır
        System.out.println("Dizinin uzunluğu " + myArrayList.length());
        System.out.println("Dizinin ilk uzunluğu " + myArrayList.first());
        System.out.println("Dizinin son uzunluğu " + myArrayList.last());
    }
}

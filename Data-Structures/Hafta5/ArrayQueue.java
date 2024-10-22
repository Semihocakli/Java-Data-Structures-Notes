package Hafta5;

class ArrayQueue {
    private int[] queueArray;  // Kuyruğu tutan dizi.
    private int front;         // Kuyruğun önündeki elemanın indeksi.
    private int rear;          // Kuyruğun arkasındaki elemanın indeksi.
    private int size;          // Kuyrukta kaç eleman bulunduğunu tutar.
    private int capacity;      // Kuyruğun maksimum kapasitesi.

    // Kuyruk oluşturucu (constructor)
    public ArrayQueue(int capacity) {
        this.capacity = capacity;           // Kapasiteyi ayarlar.
        this.queueArray = new int[capacity]; // Kapasite boyutunda bir dizi oluşturur.
        this.front = this.size = 0;          // Başlangıçta front sıfır ve kuyruk boş olduğu için size sıfırdır.
        this.rear = capacity - 1;            // Başlangıçta rear, dizinin en son elemanını gösterir.
    }

    // Kuyruğun dolu olup olmadığını kontrol eden metod
    public boolean isFull() {
        return size == capacity;  // Eğer boyut kapasiteye eşitse kuyruk doludur.
    }

    // Kuyruğun boş olup olmadığını kontrol eden metod
    public boolean isEmpty() {
        return size == 0;  // Eğer boyut sıfırsa kuyruk boştur.
    }

    // Kuyruğa eleman ekleme (enqueue) metodu
    public void enqueue(int data) {
        if (isFull()) {  // Eğer kuyruk doluysa yeni eleman eklenemez.
            System.out.println("Queue is full. Cannot add " + data);
            return;  // Fonksiyondan çıkılır.
        }
        // Ekleme işlemi: rear indeksini döngüsel olarak artır ve veriyi ekle
        rear = (rear + 1) % capacity;  // rear bir ileri alınır (mod işlemi dizinin sonuna gelince tekrar başa döner).
        queueArray[rear] = data;       // Veriyi rear'ın gösterdiği pozisyona ekle.
        size++;                        // Kuyruktaki eleman sayısını artır.
        System.out.println(data + " added to queue");
    }

    // Kuyruktan eleman çıkarma (dequeue) metodu
    public int dequeue() {
        if (isEmpty()) {  // Eğer kuyruk boşsa eleman çıkarılamaz.
            System.out.println("Queue is empty.");
            return -1;  // Boşsa, -1 döner.
        }
        int data = queueArray[front];  // Kuyruğun önündeki elemanı çıkarılmak üzere al.
        front = (front + 1) % capacity;  // front bir ileri alınır (mod işlemi döngüsel ilerler).
        size--;  // Kuyruktaki eleman sayısını azalt.
        return data;  // Çıkarılan elemanı döndür.
    }

    // Kuyruğun önündeki elemanı gösteren metod
    public int front() {
        if (isEmpty()) return -1;  // Eğer kuyruk boşsa -1 döner.
        return queueArray[front];  // front'un gösterdiği elemanı döndür.
    }

    // Kuyruğun arkasındaki elemanı gösteren metod
    public int rear() {
        if (isEmpty()) return -1;  // Eğer kuyruk boşsa -1 döner.
        return queueArray[rear];  // rear'ın gösterdiği elemanı döndür.
    }
}

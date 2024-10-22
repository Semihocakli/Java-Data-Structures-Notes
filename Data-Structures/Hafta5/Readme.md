Kuyruk veri yapısı (Queue), veri ekleme ve çıkarma işlemlerinin farklı uçlardan gerçekleştirildiği bir veri yapısıdır. Kuyruklar, FIFO (First In, First Out) yani "ilk giren ilk çıkar" prensibine göre çalışır. Bu prensip, ilk eklenen elemanın ilk çıkarıldığı anlamına gelir.

##### Kuyruk Yapısının Özellikleri:
* Ön (Front): Kuyruğun en başında yer alan eleman, çıkarılacak ilk elemandır.
* Arka (Rear): Kuyruğun en sonunda yer alan eleman, en son eklenen elemandır.
* Ekleme (Enqueue): Yeni bir eleman kuyruğun arka ucuna eklenir.
* Çıkarma (Dequeue): Kuyruğun önündeki eleman çıkarılır.

### Kuyruk Çeşitleri:
* Basit Kuyruk (Simple Queue): Standart FIFO prensibine göre çalışır. Ekleme arka uçtan yapılır, çıkarma ön uçtan yapılır.


* Dairesel Kuyruk (Circular Queue): Kuyruğun başlangıç ve bitişi birbirine bağlanır, böylece boş yer kalmadığında döngüsel olarak tekrar başa dönebilir. Alan kullanımı verimlidir.


* Öncelikli Kuyruk (Priority Queue): Elemanlar belirli bir önceliğe göre çıkarılır. FIFO prensibi yerine, yüksek öncelikli elemanlar önce çıkarılır.


* Çift Uçlu Kuyruk (Deque - Double Ended Queue): Ekleme ve çıkarma işlemleri hem ön hem de arka uçtan yapılabilir.

##### Kuyruk Uygulamaları:
* İşletim Sistemleri: CPU iş planlama algoritmaları (Round Robin) kuyruğa dayanır.
* Ağ Trafiği: Ağ paketlerinin sırası ve veri iletim işlemleri kuyruk yapısını kullanır.
* Baskı Kuyrukları: Birden fazla belge baskıya gönderildiğinde, sıraya alınır ve sıra ile yazdırılır.
* Müşteri Hizmetleri: Kuyruklar, birden fazla müşterinin hizmet almayı beklediği sistemlerde kullanılır.
* Veri Akışı: Gerçek zamanlı veri akışlarını sıralamak ve işlemek için kuyruk yapıları kullanılabilir.

#### Kuyruk Veri Yapısı Operasyonları:
* Enqueue (Ekleme): Kuyruğun arkasına yeni bir eleman ekler.

* Dequeue (Çıkarma): Kuyruğun önünden bir eleman çıkarır.

* Front: Kuyruğun önündeki elemanı gösterir.

* Rear: Kuyruğun arkasındaki elemanı gösterir.

* isEmpty: Kuyruğun boş olup olmadığını kontrol eder.

* isFull (Dairesel Kuyrukta): Kuyruğun dolu olup olmadığını kontrol eder (sabit uzunlukta kuyruğa sahip sistemlerde).

```
class Queue {
    private int[] elements;
    private int front, rear, size, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.front = this.size = 0;
        this.rear = capacity - 1;
    }

    public boolean isFull() {
        return (size == capacity);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear + 1) % capacity;
        elements[rear] = data;
        size++;
        System.out.println(data + " added to the queue.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int data = elements[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public int front() {
        if (isEmpty()) return -1;
        return elements[front];
    }

    public int rear() {
        if (isEmpty()) return -1;
        return elements[rear];
    }
}

```
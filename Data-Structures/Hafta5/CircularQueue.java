package Hafta5;

class CircularQueue {
    private int[] queue;  // Kuyruğun tutulacağı dizi
    private int front, rear, size, capacity;  // Kuyruğun ön, arka, boyut ve kapasitesi

    // Kuyruk oluşturucu (constructor)
    public CircularQueue(int capacity) {
        this.capacity = capacity;  // Kuyruğun kapasitesi atanır
        this.queue = new int[capacity];  // Kapasite boyutunda bir dizi oluşturulur
        this.front = this.size = 0;  // Başlangıçta front 0, boyut 0
        this.rear = capacity - 1;  // Rear dairesel olduğu için kapasitenin bir eksiğiyle başlar
    }

    // Kuyruğun dolu olup olmadığını kontrol eden metod
    public boolean isFull() {
        return size == capacity;  // Eğer boyut kapasiteye eşitse kuyruk doludur
    }

    // Kuyruğun boş olup olmadığını kontrol eden metod
    public boolean isEmpty() {
        return size == 0;  // Eğer boyut 0 ise kuyruk boştur
    }

    // Kuyruğa eleman ekleme (enqueue) metodu
    public void enqueue(int data) {
        if (isFull()) {  // Eğer kuyruk doluysa ekleme yapılamaz
            System.out.println("Queue is full");
            return;
        }

        // Rear'ı dairesel olacak şekilde bir sonraki pozisyona taşır (mod operatörü ile dairesellik sağlanır)
        rear = (rear + 1) % capacity;
        queue[rear] = data;  // Rear pozisyonuna yeni elemanı ekler
        size++;  // Kuyruğun boyutunu artırır
        System.out.println(data + " added to queue");
    }

    // Kuyruktan eleman çıkarma (dequeue) metodu
    public int dequeue() {
        if (isEmpty()) {  // Eğer kuyruk boşsa çıkarma yapılamaz
            System.out.println("Queue is empty");
            return -1;
        }

        int data = queue[front];  // Front pozisyonundaki elemanı alır
        front = (front + 1) % capacity;  // Front'u dairesel olacak şekilde bir sonraki pozisyona taşır
        size--;  // Kuyruğun boyutunu azaltır
        return data;  // Çıkarılan elemanı döndürür
    }

    // Kuyruğun önündeki elemanı gösteren metod
    public int front() {
        if (isEmpty()) {
            return -1;  // Kuyruk boşsa -1 döner
        }
        return queue[front];  // Front pozisyonundaki elemanı döner
    }

    // Kuyruğun arkasındaki elemanı gösteren metod
    public int rear() {
        if (isEmpty()) {
            return -1;  // Kuyruk boşsa -1 döner
        }
        return queue[rear];  // Rear pozisyonundaki elemanı döner
    }
}

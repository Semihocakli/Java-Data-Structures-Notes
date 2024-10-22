package Hafta5;

class LinkedListQueue {
    private Node front, rear;  // Kuyruğun ön (front) ve arka (rear) uçları

    // Kuyruk oluşturucu (constructor)
    public LinkedListQueue() {
        this.front = this.rear = null;  // Başlangıçta kuyruk boş olduğu için front ve rear null
    }
    // Kuyruğun boş olup olmadığını kontrol eden metod
    public boolean isEmpty() {
        return front == null;  // Eğer front null ise kuyruk boştur
    }

    // Kuyruğa eleman ekleme (enqueue) metodu
    public void enqueue(int data) {
        Node newNode = new Node(data);  // Yeni bir düğüm oluşturulur

        if (rear == null) {  // Eğer kuyruk boşsa
            front = rear = newNode;  // Hem front hem rear bu yeni düğümü işaret eder
            System.out.println(data + " added to queue");
            return;  // Kuyruğa ilk elemanı ekledikten sonra işlemi sonlandırır
        }

        rear.next = newNode;  // Kuyruğun arkasındaki düğümün next referansını yeni düğüme bağlar
        rear = newNode;  // Kuyruğun arkasını yeni düğüm yapar
        System.out.println(data + " added to queue");
    }

    // Kuyruktan eleman çıkarma (dequeue) metodu
    public int dequeue() {
        if (isEmpty()) {  // Eğer kuyruk boşsa çıkarma yapılamaz
            System.out.println("Queue is empty");
            return -1;
        }

        int data = front.data;  // Çıkarılacak elemanı alır
        front = front.next;     // Front bir sonraki düğümü gösterir

        if (front == null) {  // Eğer front null olduysa (kuyrukta hiç eleman kalmadıysa)
            rear = null;  // Rear da null yapılır, kuyruk tamamen boş hale gelir
        }

        return data;  // Çıkarılan elemanı döndürür
    }

    // Kuyruğun önündeki elemanı gösteren metod
    public int front() {
        if (isEmpty()) return -1;  // Eğer kuyruk boşsa -1 döner
        return front.data;         // Front'un verisini döndürür
    }

    // Kuyruğun arkasındaki elemanı gösteren metod
    public int rear() {
        if (isEmpty()) return -1;  // Eğer kuyruk boşsa -1 döner
        return rear.data;          // Rear'ın verisini döndürür
    }
}
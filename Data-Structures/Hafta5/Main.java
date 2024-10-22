package Hafta5;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);  // 5 elemanlık bir kuyruk oluştur.

        queue.enqueue(10);  // 10 sayısını kuyruğa ekler.
        queue.enqueue(20);  // 20 sayısını kuyruğa ekler.
        queue.enqueue(30);  // 30 sayısını kuyruğa ekler.
        queue.enqueue(40);  // 40 sayısını kuyruğa ekler.

        System.out.println("Front element is: " + queue.front());  // 10
        System.out.println("Rear element is: " + queue.rear());    // 40

        System.out.println(queue.dequeue() + " dequeued from queue");  // Kuyruktan eleman çıkarır. ( 10 )
        System.out.println(queue.dequeue() + " dequeued from queue");  // Bir eleman daha çıkarır. ( 20 )

        queue.enqueue(50);  // 50 sayısını kuyruğa ekler.
        queue.enqueue(60);  // 60 sayısını kuyruğa ekler.

        System.out.println("Front element is: " + queue.front());  // Güncel ön elemanı gösterir. ( 30 )
        System.out.println("Rear element is: " + queue.rear());    // Güncel arka elemanı gösterir. ( 60 )

        System.out.println("------------------------------------------------------------------------");

        LinkedListQueue queueforlinklist = new LinkedListQueue();  // Bağlı liste ile kuyruk oluştur

        queueforlinklist.enqueue(10);  // Kuyruğa 10 ekle
        queueforlinklist.enqueue(20);  // Kuyruğa 20 ekle
        queueforlinklist.enqueue(30);  // Kuyruğa 30 ekle
        queueforlinklist.enqueue(40);  // Kuyruğa 40 ekle

        System.out.println("Front element is: " + queueforlinklist.front());  // 10
        System.out.println("Rear element is: " + queueforlinklist.rear());    // 40

        System.out.println(queueforlinklist.dequeue() + " dequeued from queue");  // Kuyruktan eleman çıkarır ( 10 )
        System.out.println(queueforlinklist.dequeue() + " dequeued from queue");  // Bir eleman daha çıkarır ( 20 )

        System.out.println("Front element is: " + queueforlinklist.front());  // Güncel ön elemanı gösterir ( 30 )
        System.out.println("Rear element is: " + queueforlinklist.rear());    // Güncel arka elemanı gösterir ( 40 )

        System.out.println("------------------------------------------------------------------------");

        CircularQueue queueCircular = new CircularQueue(5);  // Kapasitesi 5 olan bir dairesel kuyruk oluştur

        queueCircular.enqueue(10);  // Kuyruğa 10 ekle
        queueCircular.enqueue(20);  // Kuyruğa 20 ekle
        queueCircular.enqueue(30);  // Kuyruğa 30 ekle
        queueCircular.enqueue(40);  // Kuyruğa 40 ekle
        queueCircular.enqueue(50);  // Kuyruğa 50 ekle

        System.out.println("Front element is: " + queueCircular.front());  // 10
        System.out.println("Rear element is: " + queueCircular.rear());    // 50

        System.out.println(queue.dequeue() + " dequeued from queue");  // Kuyruktan eleman çıkar ( 30 )
        System.out.println(queue.dequeue() + " dequeued from queue");  // Bir eleman daha çıkar ( 40 )

        System.out.println("Front element is: " + queueCircular.front());  // Güncel ön elemanı gösterir ( 10 )
        System.out.println("Rear element is: " + queueCircular.rear());    // Güncel arka elemanı gösterir ( 50 )

        queueCircular.enqueue(60);  // Kuyruğa 60 ekle, dairesellik devreye girer ve kuyruk başa döner
        queueCircular.enqueue(70);  // Kuyruğa 70 ekle

        System.out.println("Front element is: " + queueCircular.front());  // Ön elemanı tekrar gösterir
        System.out.println("Rear element is: " + queueCircular.rear());    // Arka elemanı tekrar gösterir

    }
}


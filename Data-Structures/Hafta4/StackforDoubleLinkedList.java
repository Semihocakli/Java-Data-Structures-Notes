package Hafta4;
// Node sınıfı, çift yönlü bağlı listedeki her bir düğümü temsil eder

// Çift yönlü bağlı liste ile yığın yapısını oluşturacak sınıf
class StackForDoubleLinkedList {
    private Node top;  // Yığının tepesini işaret eden referans

    // Yapıcı metot, yığının tepesini null yaparak başlatır
    public StackForDoubleLinkedList() {
        this.top = null;  // Başlangıçta yığın boştur
    }

    // Yığının boş olup olmadığını kontrol eden metot
    public boolean isEmpty() {
        return top == null;  // Eğer top null ise, yığın boştur
    }

    // Yığına eleman ekleme (Push) işlemi
    public void push(int data) {
        Node newNode = new Node(data);  // Yeni bir düğüm oluşturulur
        if (top != null) {
            top.next = newNode;         // Mevcut tepe düğümünün next referansı yeni düğümü işaret eder
            newNode.prev = top;         // Yeni düğümün prev referansı mevcut tepeyi işaret eder
        }
        top = newNode;                  // Yeni düğüm tepe düğüm haline gelir
        System.out.println(data + " yığına eklendi.");  // Eklenen veriyi ekrana yazdırır
    }

    // Yığından eleman çıkarma (Pop) işlemi
    public int pop() {
        if (isEmpty()) {  // Eğer yığın boşsa hata mesajı verilir
            System.out.println("Yığın boş. Eleman çıkarılamıyor.");
            return -1;    // Boş yığın için -1 döner
        }
        int poppedData = top.data;  // Tepe düğümündeki veriyi alır
        top = top.prev;             // Tepeyi bir önceki düğüme kaydırarak çıkarma işlemi yapılır
        if (top != null) {
            top.next = null;        // Yeni tepe düğümünün next referansı null yapılır
        }
        return poppedData;          // Çıkarılan veriyi döner
    }

    // Yığının tepesindeki elemanı gösteren (peek) metot
    public int peek() {
        if (isEmpty()) {  // Eğer yığın boşsa hata mesajı verilir
            System.out.println("Yığın boş.");
            return -1;    // Boş yığın için -1 döner
        }
        return top.data;  // Tepe düğümündeki veriyi döner
    }

    // Yığındaki tüm elemanları yazdırma işlemi
    public void printStack() {
        if (isEmpty()) {  // Eğer yığın boşsa
            System.out.println("Yığın boş.");
            return;
        }
        Node current = top;  // Başlangıçta tepe düğümünden başlar
        System.out.print("Yığın: ");
        while (current != null) {  // Listenin sonuna kadar düğümleri gezerek verileri yazdırır
            System.out.print(current.data + " ");
            current = current.prev;  // Önceki düğüme geçiş
        }
        System.out.println();
    }
}


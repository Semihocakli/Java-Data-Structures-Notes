package Hafta4;

// Tek yönlü bağlı liste ile stack yapısını oluşturacak sınıf
class LinkedListStack {
    private Node top;  // Yığının tepesini işaret eden referans (ilk düğüm)

    // Constructor (yapıcı metot), yığının tepesini null yaparak yığını başlatır
    public LinkedListStack() {
        this.top = null;  // Başlangıçta yığın boş olduğu için top null
    }

    // Yığının boş olup olmadığını kontrol eden metot
    public boolean isEmpty() {
        return top == null;  // top null ise yığın boştur
    }

    // Yığına eleman ekleme (Push) işlemi
    public void push(int data) {
        Node newNode = new Node(data);  // Yeni bir düğüm (node) oluşturulur

        newNode.next = top;             // Yeni düğümün next referansı mevcut tepeyi işaret eder
        top = newNode;                  // Yeni düğüm yığının yeni tepesine yerleşir

        System.out.println(data + " yığına eklendi.");  // Eklenen veriyi ekrana yazdırır
    }

    // Yığından eleman çıkarma (Pop) işlemi
    public int pop() {
        if (isEmpty()) {  // Eğer yığın boşsa hata mesajı verilir
            System.out.println("Yığın boş. Eleman çıkarılamıyor.");
            return -1;    // Boş yığın için -1 döner
        }

        int poppedData = top.data;  // Tepe düğümündeki veriyi alır
        top = top.next;             // Tepeyi bir alt düğüme kaydırarak çıkarma işlemi yapılır
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
        if (isEmpty()) {
            System.out.println("Yığın boş.");
            return;
        }
        Node current = top;  // Başlangıçta tepe düğümden başlar
        System.out.print("Yığın: ");
        while (current != null) {  // Listenin sonuna kadar düğümleri gezerek verileri yazdırır
            System.out.print(current.data + " ");
            current = current.next;  // Sonraki düğüme geçiş
        }
        System.out.println();
    }
}



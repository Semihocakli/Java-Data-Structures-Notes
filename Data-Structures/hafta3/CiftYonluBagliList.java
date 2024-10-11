package hafta3;
// Node class - Çift yönlü düğüm yapısı
class Node {
    int data; // Veriyi tutar.
    Node next; // Sonraki düğümü işaret eder.
    Node prev; // Önceki düğümü işaret eder.

    // Yapıcı metot, bir düğüm oluşturur ve veriyi alır.
    public Node(int data) {
        this.data = data; // Düğümdeki veriyi atar.
        this.next = null; // Başlangıçta next (sonraki) boş (null) olur.
        this.prev = null; // Başlangıçta prev (önceki) boş (null) olur.
    }
}

// Doubly Linked List class - Çift yönlü bağlı liste yapısı
class CiftYonluBagliList {
    Node head; // Listenin başını işaret eder.
    Node tail; // Listenin sonunu işaret eder.

    // Constructor, boş bir liste oluşturur.
    public CiftYonluBagliList() {
        this.head = null; // Başlangıçta listenin başı boş.
        this.tail = null; // Başlangıçta listenin sonu boş.
    }

    // Başa ekleme (add to head)
    public void addToHead(int data) {
        Node newNode = new Node(data); // Yeni bir düğüm oluşturulur.

        if (head == null) { // Eğer liste boşsa:
            head = newNode; // Yeni düğüm baş olur.
            tail = newNode; // Aynı zamanda son düğüm de baş düğüm olur.
        } else { // Liste boş değilse:
            newNode.next = head; // Yeni düğümün next'i mevcut baş düğümü işaret eder.
            head.prev = newNode; // Mevcut baş düğümün prev'i yeni düğümü işaret eder.
            head = newNode; // Yeni düğüm baş düğüm olur.
        }
    }

    // Sona ekleme (add to tail)
    public void addToTail(int data) {
        Node newNode = new Node(data); // Yeni bir düğüm oluşturulur.

        if (tail == null) { // Eğer liste boşsa:
            head = newNode; // Yeni düğüm hem baş hem son düğüm olur.
            tail = newNode;
        } else { // Liste boş değilse:
            tail.next = newNode; // Mevcut son düğümün next'i yeni düğümü işaret eder.
            newNode.prev = tail; // Yeni düğümün prev'i mevcut son düğümü işaret eder.
            tail = newNode; // Yeni düğüm son düğüm olur.
        }
    }

    // Ortaya ekleme (belirtilen pozisyona) - add to middle
    public void addToMiddle(int data, int position) {
        if (position <= 0) { // Pozisyon 0 veya daha küçükse, başa ekle.
            addToHead(data); // Başa ekleme metodunu çağırır.
            return;
        }

        Node newNode = new Node(data); // Yeni düğüm oluşturulur.

        Node temp = head; // Listeyi dolaşmak için geçici bir düğüm.
        int count = 0; // Pozisyonu izlemek için sayaç.

        // Belirtilen pozisyona ulaşana kadar ilerleriz.
        while (temp != null && count < position - 1) {
            temp = temp.next; // Bir sonraki düğüme ilerleriz.
            count++;
        }

        if (temp == null || temp.next == null) { // Pozisyon sondaysa:
            addToTail(data); // Sona ekleme metodunu çağırır.
        } else { // Ortaya ekleme:
            newNode.next = temp.next; // Yeni düğümün next'i mevcut düğümün next'ini işaret eder.
            newNode.prev = temp; // Yeni düğümün prev'i mevcut düğümü işaret eder.
            temp.next.prev = newNode; // Mevcut düğümün sonraki düğümünün prev'i yeni düğümü işaret eder.
            temp.next = newNode; // Mevcut düğümün next'i yeni düğümü işaret eder.
        }
    }

    // Baştan silme (remove from head)
    public void removeFromHead() {
        if (head == null) { // Liste boşsa:
            System.out.println("List is empty, cannot remove."); // Hata mesajı verir.
            return;
        }

        if (head == tail) { // Listede sadece bir düğüm varsa:
            head = null; // Hem baş hem de son düğüm null yapılır.
            tail = null;
        } else { // Birden fazla düğüm varsa:
            head = head.next; // Baş düğüm, bir sonraki düğüm olur.
            head.prev = null; // Yeni baş düğümün prev'i null yapılır.
        }
    }

    // Sondan silme (remove from tail)
    public void removeFromTail() {
        if (tail == null) { // Liste boşsa:
            System.out.println("liste bos"); // Hata mesajı verir.
            return;
        }

        if (head == tail) { // Listede sadece bir düğüm varsa:
            head = null; // Hem baş hem de son düğüm null yapılır.
            tail = null;
        } else { // Birden fazla düğüm varsa:
            tail = tail.prev; // Son düğüm, bir önceki düğüm olur.
            tail.next = null; // Yeni son düğümün next'i null yapılır.
        }
    }

    // Ortadan silme (belirtilen pozisyondan) - remove from middle
    public void removeFromMiddle(int position) {
        if (position <= 0) { // Pozisyon 0 veya daha küçükse, baştan sil.
            removeFromHead(); // Baştan silme metodunu çağırır.
            return;
        }

        Node temp = head; // Listeyi dolaşmak için geçici bir düğüm.
        int count = 0; // Pozisyonu izlemek için sayaç.

        // Belirtilen pozisyona ulaşana kadar ilerleriz.
        while (temp != null && count < position) {
            temp = temp.next; // Bir sonraki düğüme ilerleriz.
            count++;
        }

        if (temp == null) { // Pozisyon listenin dışındaysa:
            System.out.println("Position out of range, cannot remove."); // Hata mesajı verir.
        } else if (temp == head) { // Eğer pozisyon baş düğümse:
            removeFromHead(); // Baştan silme metodunu çağırır.
        } else if (temp == tail) { // Eğer pozisyon son düğümse:
            removeFromTail(); // Sondan silme metodunu çağırır.
        } else { // Ortadan silme:
            temp.prev.next = temp.next; // Önceki düğümün next'i, temp'in next'ini işaret eder.
            temp.next.prev = temp.prev; // Sonraki düğümün prev'i, temp'in prev'ini işaret eder.
        }
    }

    // Listeyi yazdırma (print list)
    public void printList() {
        if (head == null) { // Liste boşsa:
            System.out.println("List is empty."); // Hata mesajı verir.
            return;
        }

        Node temp = head; // Listeyi dolaşmak için geçici bir düğüm.
        while (temp != null) { // Son düğüme kadar ilerleriz.
            System.out.print(temp.data + " "); // Düğümdeki veriyi yazdırır.
            temp = temp.next; // Bir sonraki düğüme ilerleriz.
        }
        System.out.println(); // Yeni satıra geçer.
    }
}

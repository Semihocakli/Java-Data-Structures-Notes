package Hafta6;

// Öncelikli Kuyruk yapısını temsil eden sınıf
class PriorityQueue {

    // İç sınıf: Kuyruğa eklenecek her düğüm (node)
    private class Node {
        int data;       // Düğümdeki veri (öncelik ile sıralanacak değer)
        int priority;   // Düğümün öncelik seviyesi (düşük değer daha yüksek önceliği temsil eder)
        Node next;      // Bir sonraki düğüme işaret eden referans

        // Düğüm yapıcı (constructor)
        public Node(int data, int priority) {
            this.data = data;         // Veriyi ata
            this.priority = priority; // Önceliği ata
            this.next = null;         // İlk başta bir sonraki düğüm null (bağlanmamış)
        }
    }

    private Node head;  // Kuyruğun başını (en öncelikli elemanı) işaret eden referans

    // Yapıcı (constructor)
    public PriorityQueue() {
        head = null;  // İlk başta kuyruk boş olduğu için head null
    }

    // Veriyi ve önceliği ile kuyruğa ekleyen metot
    public void insert(int data, int priority) {
        Node newNode = new Node(data, priority);  // Yeni düğüm oluşturuluyor

        // Eğer kuyruk boşsa veya yeni düğüm en yüksek önceliğe sahipse, başa eklenir
        if (head == null || head.priority > priority) {
            newNode.next = head;  // Yeni düğüm eski başa işaret eder
            head = newNode;       // Yeni düğüm baş (head) olur
        } else {
            // Aksi halde, uygun yer bulunana kadar sırayla ilerle
            Node temp = head;
            while (temp.next != null && temp.next.priority <= priority) {
                temp = temp.next;  // Uygun yer bulunana kadar ilerlenir
            }
            newNode.next = temp.next;  // Yeni düğümün "next"ini, bulunan yerin sonrasına bağla
            temp.next = newNode;       // Yeni düğüm, uygun yere yerleştirilir
        }
    }

    // Kuyruktan en yüksek öncelikli elemanı çıkaran metot
    public int remove() {
        if (head == null) {
            throw new IllegalStateException("Kuyruk boş");  // Eğer kuyruk boşsa hata ver
        }
        int data = head.data;  // En yüksek öncelikli elemanın verisi
        head = head.next;      // Başı bir sonraki düğüme kaydır (çıkarmak için)
        return data;           // Çıkarılan veriyi döndür
    }

    // En yüksek öncelikli elemanı gösteren metot
    public int peek() {
        if (head == null) {
            throw new IllegalStateException("Kuyruk boş");  // Eğer kuyruk boşsa hata ver
        }
        return head.data;  // Baştaki (en yüksek öncelikli) elemanın verisini döndür
    }

    // Kuyruğun boş olup olmadığını kontrol eden metot
    public boolean isEmpty() {
        return head == null;  // Eğer head null ise kuyruk boştur
    }
}

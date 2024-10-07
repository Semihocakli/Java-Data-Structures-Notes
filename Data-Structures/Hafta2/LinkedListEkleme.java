package Hafta2;

class Node { // her sınıfın adresini yine aynı sınıfın isminde değşikende tutar.
    int data; // Düğümde saklanacak veriyi tutar.
    Node next; // Bir sonraki düğümün adresini tutar.
    public Node(int data) {
        this.data = data; // Düğümün verisini ayarlar.
        this.next = null; // Başlangıçta sonraki düğüm yoktur.
    }
}
class LinkedList {
    Node head; // Listenin başını işaret eden düğüm.
    // Node tail;
    // LinkedList oluşturulduğunda baş düğümü null olarak ayarlanır.
    public LinkedList() {
        this.head = null; // Liste boş olduğu için baş düğüm null'dır.
        // this.tail = null; suan kullanmıyorum
    }

    // 1. Başa Ekleme Metodu
    // Başa bir düğüm eklemek, o düğümün ilk sıraya geçmesini sağlıyor ve önceki baş düğüm de ikinci sıraya kayıyor.
    public void BasaEkleme(int data) {
        Node newNode = new Node(data); // Yeni bir Node(düğüm) oluşturur.

        newNode.next = head; // Yeni düğümün sonraki(next) düğümünü mevcut baş düğüm olarak ayarlar.
        head = newNode; // Baş düğümünü yeni düğüm olarak günceller.
    }

    // 2. Sona Ekleme Metodu
    // Bir bağlı listeye sonuna düğüm eklemek için listeyi son düğüme kadar takip etmemiz gerekir
    public void SonaEkleme(int data) {
        Node newNode = new Node(data); // Yeni bir düğüm oluşturur.

        if (head == null) { // Eğer liste boşsa,
            head = newNode; // Yeni düğüm baş düğüm olur.
            return; // Metottan çıkar.
        }

        Node halen = head; // Geçerli düğümü baş düğüm olarak ayarlar.

        while (halen.next != null) { // Son düğüme ulaşana kadar döngüye girer.

            halen = halen.next; // Bir sonraki düğüme geçer.

        }
        halen.next = newNode; // Son düğümün next'i yeni düğümü işaret eder.
    }

    // 3. Ortaya Ekleme (Belirli Bir Pozisyona Ekleme) Metodu
    // Ortaya ekleme işlemi, listeyi belirli bir pozisyona kadar dolaşmayı gerektirir
    public void OrtayaEkleme(int data, int position) {
        Node newNode = new Node(data); // Yeni bir düğüm oluşturur.

        if (position == 0) { // Eğer ekleme pozisyonu 0 ise,
            BasaEkleme(data); // Başa ekleme metodunu çağırır.
            return; // Metottan çıkar.
        }

        Node current = head; // Geçerli düğümü baş düğüm olarak ayarlar.

        // Belirtilen pozisyona kadar listeyi dolaşır.
        for (int i = 0; i < position - 1; i++) { // Pozisyondan bir önceki düğüme kadar iterasyon yapar.
            if (current != null) { // Eğer geçerli düğüm null değilse,
                current = current.next; // Bir sonraki düğüme geçer.
            }
        }
        if (current != null) { // Eğer geçerli düğüm hala null değilse,
            newNode.next = current.next; // Yeni düğümün next'i, geçerli düğümün next'ini işaret eder.
            current.next = newNode; // Geçerli düğümün next'i, yeni düğümü işaret eder.
        } else { // Eğer geçerli düğüm null ise,
            System.out.println("Pozisyon listenin dışındadır."); // Hata mesajı verir.
        }
    }
    public void BastanSilme() {
        if (head == null) { // Eğer liste zaten boşsa, hiçbir şey yapma.
            System.out.println("Liste zaten boş.");
            return;
        }
        head = head.next; // Baş düğümünü bir sonraki düğümle değiştir.
    }

    // Sondan silme
    public void SondanSilme() {
        if (head == null) { // Eğer liste boşsa, hiçbir şey yapma.
            System.out.println("Liste zaten boş.");
            return;
        }

        if (head.next == null) { // Eğer listede tek bir düğüm varsa,
            head = null; // Listenin başını null yaparak listeyi tamamen boşalt.
            return;
        }

        Node current = head;
        while (current.next.next != null) { // Sondan bir önceki düğüme kadar ilerle.
            current = current.next;
        }
        current.next = null; // Son düğümü silmek için sondan bir önceki düğümün next'ini null yap.
    }

    // Ortadan silme (Belirli bir pozisyondaki düğümü silme)
    public void OrtadanSilme(int position) {
        if (head == null) { // Eğer liste boşsa, hiçbir şey yapma.
            System.out.println("Liste zaten boş.");
            return;
        }

        if (position == 0) { // Eğer silinecek düğüm baş düğümse,
            BastanSilme(); // Baş düğüm silme metodunu çağır.
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) { // Silinecek düğümden bir önceki düğüme kadar ilerle.
            if (current.next != null) {
                current = current.next;
            } else {
                System.out.println("Pozisyon listenin dışındadır."); // Pozisyon geçersizse.
                return;
            }
        }

        if (current.next != null) {
            current.next = current.next.next; // Silinecek düğümü atlayarak bir sonraki düğümü işaret et.
        } else {
            System.out.println("Pozisyon listenin dışındadır.");
        }
    }
    // Arama metodu (belirli bir değeri listede arar)
    public void Arama(int data) {
        Node current = head; // Listenin başından başlar.
        int position = 0; // Pozisyon sayacı.

        while (current != null) { // Listenin sonuna kadar gider.
            if (current.data == data) { // Eğer aranan değer bulunduysa
                System.out.println(data + " değeri " + position + ". pozisyonda bulundu.");
                return; // Değer bulundu, arama işlemi sonlanır.
            }
            current = current.next; // Bir sonraki düğüme geç.
            position++; // Pozisyonu bir artır.
        }
        System.out.println(data + " değeri listede bulunamadı."); // Eğer aranan değer listede yoksa.
    }

    // Listeyi Yazdırma Metodu
    public void printList() {
        Node current = head; // Geçerli düğümü baş düğüm olarak ayarlar.
        while (current != null) { // Geçerli düğüm null olmadığı sürece döngüye devam eder.
            System.out.print(current.data + " -> "); // Düğümün verisini ekrana yazdırır.
            current = current.next; // Bir sonraki düğüme geçer.
        }
        System.out.println("null"); // Listenin sonunu belirtir.
    }
}
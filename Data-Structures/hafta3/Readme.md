Çift yönlü bağlı listeler (Doubly Linked List), veri yapıları dersinde önemli bir konudur. Tek yönlü bağlı listelere kıyasla daha esnek ve işlevsel bir yapıya sahiptir. Bu yapılar, her düğümün hem kendisinden önceki hem de sonraki düğüme işaret ettiği bir veri yapısıdır. Çift yönlü listeler, özellikle silme ve ekleme işlemlerinde avantaj sağlarlar, çünkü düğümlerin her iki yönünde de hareket edebiliriz.

### 1. Çift Yönlü Bağlı Liste Nedir?
   * Çift yönlü bağlı liste, her düğümün iki referans içerdiği (önceki ve sonraki düğümleri işaret eden) bir veri yapısıdır. Bu yapı, liste üzerinde ileri ve geri hareket etmeyi sağlar.

##### Temel Yapı:
* Data (Veri): Düğümde saklanan veri.
* Previous (Önceki): Düğümün önceki düğümünü işaret eden referans.
* Next (Sonraki): Düğümün sonraki düğümünü işaret eden referans.

````
[Previous] <- [Data] -> [Next]
````
Her düğümde iki işaretçi bulunur:

* ``Previous``: Önceki düğümü işaret eder (Head düğümünün Previous işaretçisi null olur).
* ``Next``: Sonraki düğümü işaret eder (Tail düğümünün Next işaretçisi null olur).

### 2. Çift Yönlü Listeyi Tek Yönlü Listeden Ayıran Farklar:
   * Geriye Hareket: Tek yönlü listelerde sadece ileriye doğru hareket edebilirken, çift yönlü listelerde ileri ve geri hareket edilebilir. Bu, ekleme ve silme işlemlerinde büyük bir avantaj sağlar.
   * Ekstra Hafıza Maliyeti: Çift yönlü listeler, her düğümde bir önceki düğümü işaret eden ekstra bir referans içerdiğinden, hafıza açısından tek yönlü listelere göre daha maliyetlidir.
   * Silme ve Ekleme İşlemlerinin Kolaylığı: Çift yönlü listelerde, belirli bir düğümün silinmesi veya bir düğüm eklenmesi işlemleri daha verimli yapılabilir, çünkü önceki düğümü takip etmek kolaydır.

### 3. Çift Yönlü Bağlı Listenin Avantajları
   * Geriye Doğru Gezinme: Her düğümün hem önceki hem de sonraki düğümü işaret etmesi sayesinde listenin hem başına hem de sonuna doğru rahatça gezilebilir.
   * Verimli Silme İşlemi: Bir düğümün ortadan kaldırılması gerektiğinde, çift yönlü listede önceki düğümü bulmak çok kolaydır. Bu nedenle, silme işlemleri daha verimli olur.
   * Verimli Ekleme: Belirli bir pozisyona eleman eklemek için önceki düğümü bulmak kolay olduğu için ekleme işlemleri de verimli yapılabilir.
   * Çift Taraflı Gezinme: Listenin sonuna gidip baştan tekrar başlamaya gerek kalmadan, geriye doğru hareket ederek işlem yapılabilir.

### 4. Çift Yönlü Bağlı Listede Düğüm Ekleme
   * Çift yönlü bir bağlı listeye düğüm eklemek, eklemenin nerede yapılacağına göre farklı stratejiler gerektirir.

##### . Başa Ekleme (Head'e Ekleme)
 * Yeni düğüm oluşturulur.
 * Yeni düğümün next referansı mevcut baş düğümü (head) işaret eder.
 * Mevcut baş düğümün previous referansı yeni düğümü işaret eder.
 * Yeni düğüm baş düğüm olur.

##### b. Sona Ekleme (Tail'e Ekleme)
* Yeni düğüm oluşturulur.
* Yeni düğümün previous referansı mevcut son düğümü (tail) işaret eder.
* Mevcut son düğümün next referansı yeni düğümü işaret eder.
* Yeni düğüm son düğüm (tail) olur.

##### c. Ortaya Ekleme (Belirli bir Pozisyona Ekleme)
Liste üzerinde belirlenen pozisyona kadar ilerlenir.
Yeni düğüm eklenirken, önceki ve sonraki düğümlerin referansları güncellenir.

### 5. Çift Yönlü Bağlı Listede Düğüm Silme
   * Düğüm silme işlemi de, baştan, sondan ya da ortadan silmeye göre değişir.

##### a. Baştan Silme
* Baş düğüm silinir.
* Head, bir sonraki düğüme kaydırılır ve önceki işaretçi null yapılır.

##### b. Sondan Silme
* Son düğüm silinir.
* Tail, bir önceki düğüme kaydırılır ve yeni son düğümün next işaretçisi null yapılır.

##### c. Ortadan Silme
Belirli bir pozisyondaki düğüm silinir.
Silinen düğümün önceki düğümünün next referansı, silinen düğümün sonrasındaki düğümü işaret eder ve tam tersi de yapılır.

````
class Node {
    int data;
    Node previous;
    Node next;

    public Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Başa ekleme
    public void addToHead(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // Sona ekleme
    public void addToTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
    }

    // Ortaya ekleme (belirli bir pozisyonda)
    public void addToPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            addToHead(data);
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current != null) {
                current = current.next;
            }
        }
        if (current != null) {
            newNode.next = current.next;
            if (current.next != null) {
                current.next.previous = newNode;
            }
            current.next = newNode;
            newNode.previous = current;
        } else {
            System.out.println("Pozisyon listenin dışındadır.");
        }
    }

    // Listeyi yazdırma
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
````

### 6. Çift Yönlü Bağlı Listenin Dezavantajları
   * Hafıza Tüketimi: Her düğümde iki referans bulunduğu için, tek yönlü listeye göre daha fazla hafıza kullanır.
   * Ekstra İşlem Maliyeti: Ekstra referansların ayarlanması gerektiğinden, işlem maliyeti biraz daha yüksektir.

### 7. Çift Yönlü Listelerde Kullanım Alanları
 * Tarayıcı Geçmişi (Browser History): İleri ve geri hareket edebilme ihtiyacı olan durumlar.
 * Müzik Çalıcıları: Bir önceki ve sonraki şarkıya geçme.
 * Undo-Redo İşlemleri: Geriye ve ileriye doğru işlemleri takip etme.

### 8. Çift Yönlü Listede Olası Hatalar
   * NullPointerException: Listenin boş olduğu durumlarda, düğüm eklerken veya silerken null referanslar ile karşılaşabilirsiniz.
   * Yanlış Referans Ayarlamaları: Düğüm eklerken ya da silerken previous ve next referanslarının doğru ayarlanmadığından emin olunmalıdır.

### Sonuç:
* Çift yönlü bağlı listeler, ileri ve geri gezinme olanağı sunan ve verimli ekleme/silme işlemleri sağlayan güçlü bir veri yapısıdır. Bu yapıyı öğrenmek, veri yapılarını daha iyi anlamak ve farklı durumlarda esnek çözümler üretebilmek için önemlidir.
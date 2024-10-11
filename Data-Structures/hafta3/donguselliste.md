* Döngüsel bağlı liste (Circular Linked List), bağlı listeler arasında özel bir yapıdır. 
* Bu yapı, son düğümün (tail) bir sonraki düğümü olarak ilk düğümü (head) işaret etmesiyle oluşur. 
* Yani liste, bir döngü oluşturur ve son düğümden sonra tekrar başa dönülür. Döngüsel bağlı liste, hem tek yönlü (singly) hem de çift yönlü (doubly) olabilir.

### 1. Döngüsel Bağlı Liste Nedir? 
   Döngüsel bağlı liste, son düğümün next işaretçisinin baş düğümü işaret ettiği, yani son düğümden sonra listenin tekrar başına döndüğü bir veri yapısıdır. Bu sayede, liste üzerinde sürekli bir döngü oluşur.

* Döngüsel Tek Yönlü Bağlı Liste (Circular Singly Linked List)

Her düğüm, sadece bir sonraki düğümü işaret eder.
Son düğüm, baş düğümü işaret eder.
* Döngüsel Çift Yönlü Bağlı Liste (Circular Doubly Linked List)

Her düğüm, hem önceki hem de sonraki düğümü işaret eder.
Son düğümün next işaretçisi baş düğümü, baş düğümün previous işaretçisi ise son düğümü işaret eder.

````
Döngüsel Tek Yönlü Liste:
[Data1] -> [Data2] -> [Data3] -> [Data1] (Başa döner)

Döngüsel Çift Yönlü Liste:
[Data1] <-> [Data2] <-> [Data3] <-> [Data1] (Başa ve sona döner)
````

### 2. Döngüsel Bağlı Listenin Özellikleri
   * Sürekli Dolaşım: Listenin sonuna ulaştığınızda tekrar başa dönebilirsiniz. Bu özellik, belirli döngüsel yapılar ve sonsuz gezinme gerektiren uygulamalar için oldukça kullanışlıdır.
   * Baş ve Son Farkı Kalkar: Döngüsel bağlı listelerde, baş düğüm ve son düğüm arasındaki fark ortadan kalkar çünkü liste bir döngü halindedir.
   * Sürekli Gezinme: Liste üzerinde dolaşırken herhangi bir sınır olmaz. Liste üzerinde bir düğümden başlayarak sürekli dolaşabilirsiniz.

### 3. Döngüsel Bağlı Liste ile Diğer Bağlı Listeler Arasındaki Farklar
   #### a. Tek Yönlü Bağlı Listeler (Singly Linked List) ile Farkı
   * Tek Yönlü Bağlı Liste: Son düğümün next işaretçisi null'ı gösterir ve son düğüme geldiğinizde liste biter. Gezinme sadece bir yönde (baştan sona) mümkündür.
   *  Döngüsel Tek Yönlü Liste: Son düğüm, baş düğümü işaret eder, yani listenin sonuna geldiğinizde tekrar başa dönersiniz. Liste sonu yoktur, sürekli döngüde gezinilebilir.
   
   #### b. Çift Yönlü Bağlı Listeler (Doubly Linked List) ile Farkı
   * Çift Yönlü Bağlı Liste: Her düğüm hem önceki hem de sonraki düğümü işaret eder, ancak son düğümün next işaretçisi null'ı gösterir. Gezinme iki yönlüdür, ancak döngü yoktur.
   * Döngüsel Çift Yönlü Liste: Hem önceki hem de sonraki düğümlerde gezinmek mümkündür ve listenin sonuna veya başına geldiğinizde bir döngü oluşur. Son düğümden sonra başa, baş düğümden önce ise sona gidebilirsiniz.

   #### c. Son Düğüm ile İlgili Farklar
   * Tek ve çift yönlü bağlı listelerde son düğüm *null* referansına sahiptir. Döngüsel listelerde ise son düğüm baş düğümü işaret eder.

### 4. Döngüsel Bağlı Listelerin Avantajları
   * Sürekli Gezinme: Döngüsel bir yapı sayesinde listenin başı ve sonu birbirine bağlıdır. Bir düğümden başlayarak sürekli liste üzerinde dolaşabilirsiniz.
   * Kuyruk Yapıları İçin İdeal: Döngüsel bağlı listeler, kuyruk (queue) yapıları için uygundur. Bir kuyruktaki tüm elemanlar işlendikten sonra tekrar başa dönmek gerekiyorsa bu yapı kullanılabilir.
   * Bellek Kullanımında Verimlilik: Döngüsel listelerde bellekte son düğümün null işaretçisi olmadığı için bu tür listeler, özel durumlar için verimli bir kullanım sunabilir.

### 5. Döngüsel Bağlı Listelerde Düğüm Ekleme
   * Düğüm ekleme işlemi, döngüsel listelerde de benzer şekildedir. Tek fark, listenin sonunda null işaretçisi olmamasıdır.

#### a. Sona Düğüm Ekleme
* Normal bağlı listelerde olduğu gibi düğüm sona eklenir.
Ancak döngüsel listede, yeni düğüm eklenirken son düğümün next işaretçisi, yeni düğüm yerine baş düğümü işaret etmeye devam eder.
#### b. Başa Düğüm Ekleme
* Yeni düğüm, baş düğüm olarak ayarlanır ve eski baş düğüm sona doğru bağlanır.
Son düğümün next işaretçisi tekrar yeni baş düğümü işaret eder.

### 6. Döngüsel Bağlı Listelerde Düğüm Silme
   * Silme işlemi, diğer bağlı listelere oldukça benzerdir. Sadece listenin başı ve sonu arasında bir döngü olduğundan, null referansı yoktur.

* Baştan Silme: Baş düğüm silinir ve son düğümün ``next`` işaretçisi yeni baş düğümü işaret eder.
* Sondan Silme: Son düğüm silinir ve yeni son düğümün ``next`` işaretçisi baş düğümü işaret eder.

````
Basit bir döngüsel bağlı liste Java implementasyonu aşağıda verilmiştir:

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head = null;
    Node tail = null;

    // Başa düğüm ekleme
    public void addToHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Döngü oluştur
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Döngü devam eder
        }
    }

    // Sona düğüm ekleme
    public void addToTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Döngü oluştur
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Döngü devam eder
        }
    }

    // Listeyi yazdırma
    public void printList() {
        if (head == null) {
            System.out.println("Liste boş");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Başa döner)");
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cList = new CircularLinkedList();
        cList.addToHead(10);
        cList.addToTail(20);
        cList.addToTail(30);
        cList.addToHead(5);

        cList.printList(); // 5 -> 10 -> 20 -> 30 -> (Başa döner)
    }
}
````

### 8. Döngüsel Bağlı Listelerin Kullanım Alanları
   * Döngüsel bağlı listeler, genellikle döngüsel veri yapıları ve döngüsel işlemler gerektiren uygulamalarda kullanılır:

* Zaman Paylaşımı Sistemleri: İşlemlerin sırayla yürütülmesi gerektiğinde, her işleme belirli bir süre verilir ve sıradaki işleme geçildiğinde tekrar başa dönülmesi gereken sistemlerde.
* Müzik Çalıcıları: Şarkı listesi döngüsünde kullanılabilir.
* Oyunlar: Oyuncular arasında sürekli tur dönen oyunlarda.

### 9. Döngüsel Bağlı Liste ile Diğer Bağlı Listeler Arasındaki Avantaj ve Dezavantajlar
  * Avantajları: 
      - Sürekli döngüsel gezinme
      - Bellekte ``null`` işaretçisi gerekmez
      - Kuyruk yapılarında kolaylık sağlar
* Dezavantajları:
   - Döngü kontrolü dikkatli yapılmazsa sonsuz döngü riski oluşur
   - Çıkmaz döngüye girme olasılığı artar
   - Kodu yazmak ve hata ayıklamak daha karmaşık olabilir

Sonuç olarak, döngüsel bağlı liste, döngüsel işlemlerde oldukça kullanışlı olan bir veri yapısıdır. Farklı bağlı liste türleriyle kıyaslandığında, özel kullanım alanlarına hitap eder ve özellikle kuyruk yapılarında etkili çözümler sunar.
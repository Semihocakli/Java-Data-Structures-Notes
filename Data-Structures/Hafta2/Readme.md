Dizi, sabit boyutta bir veri kümesi oluşturur ve veriler ardışık bellek alanlarında saklanır. Bu yapının önemli avantajları şunlardır:

 * Sabit Boyut: Diziyi oluşturduğunuzda belirli bir boyut belirtirsiniz ve bellekte bu kadar alan ayrılır.
 * Hızlı Erişim: Herhangi bir elemana doğrudan, indeksi aracılığıyla hızlıca erişebilirsiniz. Örneğin, arr[3] dizi içinde 3. indeksteki elemanı verir.

Ancak dizilerin bazı önemli dezavantajları vardır:
 * Sabit Boyut: Diziyi oluşturduktan sonra boyutunu değiştiremezsiniz. Eğer dizinin kapasitesi dolarsa, yeni bir dizi oluşturup tüm verileri taşımak zorunda kalırsınız.
 * Bellek İsrafı: Eğer büyük bir dizi oluşturursanız ve sadece küçük bir kısmını kullanırsanız, kalan bellek israf olur.
 * Veri Ekleme/Çıkarma: Ortaya ya da başa yeni bir eleman eklemek, tüm elemanları kaydırmayı gerektirir ve bu işlem zaman alıcıdır.

### Bağlı Listelerin Tanımı
İşte bu noktada bağlı listeler (linked lists) devreye girer. Bağlı listeler, dizilerin bu sınırlamalarını aşmamızı sağlayan, dinamik bir veri yapısıdır.

**Bağlı liste nedir?**

Bağlı liste, her bir elemanın (düğüm - node) kendi verisini ve bir sonraki elemanın adresini (bağlantı - link) sakladığı bir veri yapısıdır. Bu sayede elemanlar bellekte ardışık olmak zorunda değildir. Bağlantılar sayesinde veriler zincir şeklinde birbiriyle bağlanır.

Bağlı listelerde her bir düğüm şu iki bilgiyi içerir:
 * Veri (data): Düğümde saklanan asıl bilgi.
 * Bağlantı (link): Bir sonraki düğümün adresi, yani bellekteki yerini gösterir.

```
örnek düğüm => Düğüm: | Veri | Bağlantı (next) |
```

## Tek Yönlü Bağlı Liste (Singly Linked List)
* Tek yönlü bağlı liste, her bir düğümün yalnızca bir sonraki düğümü işaret ettiği bir yapıdadır. Yani, veriler bir zincir gibi baştan sona doğru sıralanır ve sadece ileri doğru hareket edilebilir.

Bir tek yönlü bağlı liste şu şekilde görünür:
```
Baş -> Düğüm 1 -> Düğüm 2 -> Düğüm 3 -> ... -> Son
```
* Düğümler Nasıl Bağlanır?

Her düğümün kendisinde bir veri bulunur ve bir de bir sonraki düğümü işaret eden bağlantı (link) vardır. İlk düğüm, listenin başını (head) temsil eder. Baş düğümden başlayarak sırayla tüm düğümlere ulaşabiliriz.

* Örneğin, bir tek yönlü bağlı listede şu adımları takip ederek veriler üzerinde işlem yaparız:

1.) Baş düğümden (head) başlarız. \
2.) Düğümdeki veriyi işleriz.\
3.) Sonraki düğüme (next) geçeriz ve aynı işlemleri tekrar ederiz. \
4.) Son düğüme ulaştığımızda (bağlantısı olmayan düğüm), listeyi tamamlamış oluruz.

* Temel Kavramlar:

  * Baş (head): Listenin ilk düğümüdür. Tüm listeye buradan erişilir.
  * Sonraki (next): Bir düğümün bir sonraki düğümü işaret eden bağlantısıdır.
  * Boş (null): Listenin son düğümünde bir sonraki düğüm olmadığı için bağlantı null değerini alır.

```
private void add(Node tNode, int position) {
    if(this.Head == null && position == 0) { 
        //List is empty and position is zero
        this.Head = tNode;
        this.Tail = tNode;
    } else if(this.Head != null && position == 0) { 
        //List is not empty add node at position zero (Head)
        tNode.setNext(this.Head);
        this.Head = tNode;
    } else if(this.Head != null && position == this.elementNumber) {
        //Add node to the tail
        Tail.setNext(tNode);
        Tail = tNode;
    } else if(position != this.elementNumber && position != 0) {
        Node temp = this.Head;
        Node temp2;
       
        for(int i = 0; i < position - 1; i++) {
            temp = temp.getNext();
        }
        temp2 = temp.getNext();
        
        temp.setNext(tNode);
        tNode.setNext(temp2);
    } else {
        //Unhandled Scenario
        System.err.println("Unhandled Case");
        try {
            throw new Exception("Unhandled Case");
        } catch (Exception ex) {
            Logger.getLogger(MyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.elementNumber--;
    }
    this.elementNumber++;
}

```
* add(Node tNode, int position): Belirli bir pozisyona düğüm ekler. Farklı durumları işler:
   * Liste boş ve pozisyon sıfırsa: Yeni düğüm hem baş hem de son düğüm olur.
   * Liste dolu ve pozisyon sıfırsa: Yeni düğüm başa eklenir. 
   * Pozisyon listedeki düğüm sayısına eşitse (son ekleme): Yeni düğüm sona eklenir.
   * Ortaya ekleme: Mevcut düğümler arasında belirtilen pozisyona düğüm eklenir.  
   * İşlenmemiş senaryolarda hata verir.

##### Genel Çalışma Mantığı:
 * Node sınıfı, bağlı listenin her bir elemanını temsil eder.
 * MyLinkedList sınıfı, bu düğümleri yöneten bir liste yapısıdır.
 * Ekleme işlemleri: Yeni düğümler eklenir. Başa, sona veya belirtilen pozisyona düğüm eklenebilir.
 * Listeyi yazdırma: Listenin düğümlerinin verileri yazdırılır.
 * Bu yapı, bir veri yapısını (LinkedList) nasıl sıfırdan oluşturacağınızı ve nasıl yönetebileceğinizi gösterir.

##### Oluşabilecek Bütün Senaryolar

* Senaryo 1: Boş Liste
Liste tamamen boştur (Head ve Tail null).
İlk eleman eklenirken, hem Head hem de Tail yeni eklenen düğüme işaret eder.


* Senaryo 2: Tek Düğüm (Single Node)
Listede sadece bir düğüm vardır.
Baş (Head) ve son (Tail) aynı düğümü işaret eder.
Yeni düğüm eklendiğinde Tail güncellenir.
Tek düğümü silmek listeyi tekrar boş hale getirir.


* Senaryo 3: Birden Fazla Düğüm (Multiple Nodes)
Listede birden fazla düğüm bulunur.
Ekleme işlemi başa, sona veya ortaya yapılabilir.
Silme işlemi baştan, sondan veya ortadan olabilir.


* Senaryo 4: Sondan Ekleme
Yeni düğüm listeye son düğüm olarak eklenir.
Tail, yeni düğümü işaret eder.
Tail.setNext(tNode) ve ardından Tail = tNode işlemleri yapılır.


* Senaryo 5: Başa Ekleme
Yeni düğüm listeye baş düğüm olarak eklenir.
Yeni düğümün next referansı mevcut baş düğümü işaret eder, ve sonra Head bu yeni düğümü işaret eder.


* Senaryo 6: Ortaya Ekleme
Liste içinde, belirtilen pozisyona yeni düğüm eklenir.
Eklenecek pozisyona kadar gezilir ve yeni düğüm, o pozisyondaki düğümden önce eklenir.


* Senaryo 7: Baştan Silme
Bağlı listenin başındaki düğüm silinir.
Head, bir sonraki düğüme kaydırılır.


* Senaryo 8: Sondan Silme
Listenin son düğümü silinir.
Son düğümden önceki düğümün next referansı null yapılır ve Tail bir önceki düğüme kaydırılır.


* Senaryo 9: Ortadan Silme
Listenin ortasındaki bir düğüm silinir.
Silinen düğümün önceki düğümünün next referansı, silinen düğümün sonrasındaki düğüme işaret eder.


* Senaryo 10: Tek Düğüm Varken Silme
Listede yalnızca bir düğüm varken bu düğüm silinir.
Hem Head hem de Tail null olur, liste boş hale gelir.


* Senaryo 11: Ekleme Yaparken Liste Taşma Durumu (Overflow)
Listeye, sınırlı bir boyut öngörülmüşse (örn. sabit sayıda düğüm) ve kapasite aşıldığında, taşma (overflow) durumu oluşabilir.
Yeni düğüm eklenemez ve hata verilir (Örn: Pozisyon aralığı dışı durumu).


* Senaryo 12: Listeyi Ters Çevirme (Reverse List)
Mevcut bir listeyi ters çevirmek isteyebilirsiniz, yani listenin sonundan başına doğru düğümleri yeniden düzenlemek.


* Senaryo 13: Arama İşlemi (Search Operation)
Belirli bir değeri içeren düğüm listede aranabilir.
Aranan düğüm bulunamazsa, bir hata veya bilgi mesajı döner.


* Senaryo 14: Listeyi Yeniden Düzenleme (Reordering the List)
Bağlı liste içerisindeki düğümleri belirli bir sıraya göre (örneğin artan ya da azalan sıraya) yeniden düzenlemek gerekebilir.


* Senaryo 15: Düğümleri Bağlı Olmayan Yapılarla Birleştirme
İki farklı bağlı listeyi birleştirmek, yani bir listenin sonuna diğer listeyi eklemek (concatenation).


* Senaryo 16: Liste Kopyalama (Deep Copy of List)
Bir bağlı listenin birebir kopyasını oluşturma. Tüm düğümleri ve bağlantıları birebir kopyalamak.


* Senaryo 17: Döngüsel Liste (Circular Linked List)
Listenin sonundaki düğüm, baştaki düğüme geri işaret eder ve döngüsel bir liste yapısı oluşturur.


* Senaryo 18: Kendine İşaret Eden Düğüm (Self-referential Node)
Bir düğüm kendi kendisine işaret eder. Bu, sonsuz döngüye neden olabilir ve dikkat edilmesi gereken bir senaryodur.
### Heap Ağacının Özellikleri:
1.) İkili Ağaç (Binary Tree):
* Heap ağacı, ikili bir ağaçtır, yani her düğümün en fazla iki çocuğu vardır.

2.) Tam Ağaç (Complete Tree):
* Heap ağacı tam bir ikili ağaçtır, yani tüm seviyeler doludur ve son seviye, sol taraftan itibaren tamamen doldurulmuştur.

3.) Heap Özelliği (Heap Property):
* Heap ağacı, her düğümün belirli bir düzen kurallarına uyması gerektiği bir yapıdır.
* Max-Heap: Her düğüm, çocuklarından daha büyük ya da onlara eşit olmalıdır. Kök düğüm en büyük değere sahiptir.
* Min-Heap: Her düğüm, çocuklarından daha küçük ya da onlara eşit olmalıdır. Kök düğüm en küçük değere sahiptir.

#### Heap Türleri:
##### Max-Heap:

* Max-Heap'te her düğüm, altındaki çocuk düğümlerden büyük veya onlara eşit bir değere sahiptir.
* Kök düğüm (root), ağacın en büyük elemanını içerir.
* Max-Heap, en büyük elemanı hızlıca bulmak veya çıkarmak gerektiğinde kullanılır (örneğin, öncelikli kuyruk uygulamaları).

##### Min-Heap:

* Min-Heap'te her düğüm, altındaki çocuk düğümlerden küçük veya onlara eşit bir değere sahiptir.
* Kök düğüm, ağacın en küçük elemanını içerir.
* Min-Heap, en küçük elemanı hızlıca bulmak veya çıkarmak gerektiğinde kullanılır (örneğin, Dijkstra'nın en kısa yol algoritması gibi).

#### Heap Ağacının Temel İşlemleri:
##### Ekleme (Insertion):
* Yeni bir eleman heap'e eklenirken, önce en alt seviyede uygun bir boş yere eklenir (tam ağacın özelliğini bozmamak için).
* Sonra bu eleman, heap özelliğini korumak için yukarıya doğru taşınır (bu işleme "sift-up" veya "bubble-up" denir).
* Max-Heap'te eleman, ebeveynlerinden büyükse yukarı çıkar; Min-Heap'te ise ebeveynlerinden küçükse yukarı çıkar.

##### Çıkarma (Deletion):
* Genellikle kök düğüm (en büyük veya en küçük eleman) çıkarılır.
* Kök düğüm çıkarıldıktan sonra, en alttaki ve en sağdaki düğüm kök düğüme taşınır.
* Sonra bu düğüm, heap özelliğini korumak için aşağıya doğru taşınır (bu işleme "sift-down" veya "bubble-down" denir).

##### Yığınlaşma (Heapify):

* Bir dizi (array) üzerinde heap yapısını kurmak için kullanılır.
* Herhangi bir diziyi heap yapısına dönüştürmenin zamanı O(n) dir.

##### Heap Yapısının Zaman Karmaşıklığı:
* Ekleme (Insertion): O(log n) – Yeni eleman eklendiğinde eleman yukarıya doğru en fazla log n kadar hareket eder.
* Çıkarma (Deletion): O(log n) – Kök düğüm çıkarıldığında en alttaki düğüm aşağıya doğru en fazla log n kadar hareket eder.
* Peek (Kök Düğümün Bulunması): O(1) – En büyük (max-heap) veya en küçük (min-heap) eleman her zaman kök düğümde bulunur.
* Yığınlaşma (Heapify): O(n) – Bir diziyi heap yapısına dönüştürme işlemi.

##### Heap Uygulamaları:

* Öncelikli Kuyruklar (Priority Queues):
Öncelikli kuyruklar, en yüksek veya en düşük önceliğe sahip elemanın ilk çıkarıldığı veri yapılarıdır. Heap yapısı bu tür kuyrukların verimli bir şekilde uygulanmasını sağlar.
Max-Heap, en yüksek öncelikli elemanın hızlıca çıkarılması gereken durumlar için uygundur.
Min-Heap ise en düşük öncelikli elemanın çıkarılması gereken durumlar için uygundur.

* Sıralama Algoritmaları (Heap Sort):
Heap Sort, bir diziyi sıralamak için heap yapısını kullanır. Öncelikle dizi heap yapısına dönüştürülür ve sonra en büyük (veya en küçük) eleman çıkarılarak diziye eklenir.
Zaman karmaşıklığı: O(n log n).

* Grafik Algoritmaları:

Dijkstra ve Prim algoritmaları gibi grafik algoritmalarında min-heap, en kısa yol veya minimum kaplama ağacı (minimum spanning tree) bulmak için kullanılır.
Çöp Toplama (Garbage Collection):

Bilgisayarın belleğinde kullanılmayan nesneleri toplamak için kullanılan belirli algoritmalar heap yapısını kullanır.


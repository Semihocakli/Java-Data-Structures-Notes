## Yığın (Stack) Veri Yapısı:
* Yığın (stack), Last In First Out (LIFO) yani son giren ilk çıkar prensibine göre çalışan bir veri yapısıdır. 
* Yani yığına son eklenen eleman ilk olarak çıkarılır. Bunu bir tabak yığını gibi düşünebilirsiniz: En son koyduğunuz tabağı, ilk alırsınız.

#### Temel İşlemler:
* Push (Ekleme): Yığına yeni bir eleman ekleme işlemidir. Yeni eleman, yığının en üstüne eklenir.
* Pop (Çıkarma): Yığının en üstündeki elemanı çıkarma işlemidir. Eğer yığın boşsa, pop işlemi gerçekleştirilemez.
* Peek (Üstteki Elemanı Görme): Yığının en üstündeki elemanı çıkarılmadan görme işlemidir.
* IsEmpty (Boş mu?): Yığının boş olup olmadığını kontrol eder.
* IsFull (Dolu mu?): Yığının kapasitesine göre dolu olup olmadığını kontrol eder (statik yığınlar için geçerlidir).

#### Yığın Uygulamaları:
* Fonksiyon Çağrıları (Function Calls): Bir programda fonksiyonlar çağrıldığında her yeni çağrı, yığına eklenir. İşlemler tamamlandıkça bu çağrılar yığından çıkarılır.

* Geri Alma (Undo) Mekanizması: Bir kelime işlemci ya da grafik düzenleme programındaki geri alma (undo) özelliği yığın yapısıyla çalışır. Son yapılan işlem geri alınırken, yığından çıkarılır.

* Yol Bulma (Backtracking): Bir labirentte geriye doğru izleme (backtracking) işlemleri, yığının yardımıyla yapılır. Yanlış bir yola girildiğinde, yığındaki önceki konumlara geri dönülebilir.

* Parantez Eşleştirme (Balanced Parentheses): Programlama dillerinde açılan parantezlerin doğru kapanıp kapanmadığını kontrol etmek için yığın kullanılır. Açılan her parantez yığına eklenir ve kapalı parantezler sırasıyla çıkarılır.

##### Yığının Uygulanması:
* Yığınlar statik veya dinamik olarak uygulanabilir:

* Statik Yığın: Bir dizi (array) kullanılarak oluşturulur. Dizinin sabit boyutu olduğundan dolayı yığın kapasitesi sınırlıdır ve dolduğunda yeni eleman eklenemez.

* Dinamik Yığın: Bağlı liste kullanılarak oluşturulur ve yığın kapasitesi dinamik olarak büyüyüp küçülebilir. Bağlı liste yapısı, bellek kullanımı açısından daha esnektir.


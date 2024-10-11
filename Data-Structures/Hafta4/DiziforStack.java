package Hafta4;

class DiziforStack {
    private int[] stackArray; // Yığını tutacak dizi
    private int top;          // Yığının tepesini işaret eden değişken
    private int maxSize;      // Yığının maksimum kapasitesi

    // Constructor (Yapıcı metot) - Yığın boyutunu belirler
    public DiziforStack(int size) {
        maxSize = size;               // Yığının kapasitesini belirler
        stackArray = new int[maxSize]; // Belirtilen boyutta bir dizi oluşturur
        top = -1;                     // Başlangıçta yığın boş olduğu için top -1'dir
    }

    // Eleman ekleme (Push) işlemi
    public void push(int data) {
        if (isFull()) {              // Yığının dolu olup olmadığını kontrol eder
            System.out.println("Yığın dolu. Eleman eklenemiyor."); // Eğer yığın doluysa ekleme yapılmaz
        } else {
            stackArray[++top] = data;  // top'ı 1 artırır ve elemanı yığına ekler
        }
    }

    // Eleman çıkarma (Pop) işlemi
    public int pop() {
        if (isEmpty()) {              // Yığının boş olup olmadığını kontrol eder
            System.out.println("Yığın boş. Eleman çıkarılamıyor.");
            return -1;                // Yığın boşsa -1 döner
        } else {
            return stackArray[top--];  // En üstteki elemanı döndürür ve top'ı 1 azaltır
        }
    }

    // Yığının tepesindeki elemanı görme (Peek)
    public int peek() {
        if (isEmpty()) {              // Yığının boş olup olmadığını kontrol eder
            System.out.println("Yığın boş.");
            return -1;                // Eğer yığın boşsa -1 döner
        } else {
            return stackArray[top];    // En üstteki elemanı döndürür (ancak çıkarmadan)
        }
    }

    // Yığının boş olup olmadığını kontrol eder
    public boolean isEmpty() {
        return (top == -1);            // top -1 ise yığın boştur
    }

    // Yığının dolu olup olmadığını kontrol eder
    public boolean isFull() {
        return (top == maxSize - 1);   // top yığının son elemanına eşitse doludur
    }

    // Yığındaki elemanları yazdırma işlemi
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Yığın boş.");
        } else {
            System.out.print("Yığın: ");
            for (int i = 0; i <= top; i++) { // Yığındaki elemanları baştan sona kadar yazdırır
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

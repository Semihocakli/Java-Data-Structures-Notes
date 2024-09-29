package JavaTutorial;
/*
* tekrar tekrar çağırılan metodlar recursive metodlar
*/
public class RecursiveMethod {
    public static int faktoriyel(int n) {
        if (n == 0) {
            // Temel durum: 0! = 1
            return 1;
        } else {
            // Recursive durum: n! = n * (n-1)!
            return n * faktoriyel(n - 1);
        }
    }
    /*
faktoriyel(5) çağrılır.
faktoriyel(5), 5 * faktoriyel(4) hesaplar.
faktoriyel(4), 4 * faktoriyel(3) hesaplar.
Bu süreç faktoriyel(0)'a kadar devam eder ve 1 döner.
Sonuçlar geriye doğru döner ve çarpılır: 5 * 4 * 3 * 2 * 1.
    */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Recursive durum: fib(n) = fib(n-1) + fib(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
/*
fibonacci(6) çağrılır.
fibonacci(6), fibonacci(5) + fibonacci(4) hesaplar.
Bu hesaplama devam eder ve fibonacci(0) ile fibonacci(1) değerlerine ulaşıldığında temel durumlara ulaşılır.
Sonuçlar geriye doğru toplanarak çözüm bulunur.
*/
public static int arraySum(int[] arr, int n) {
    if (n <= 0) {
        return 0;
    } else {
        return arr[n - 1] + arraySum(arr, n - 1);
    }
}
/*
arraySum(arr, 1) = 1 + 0 = 1
arraySum(arr, 2) = 2 + 1 = 3
arraySum(arr, 3) = 3 + 3 = 6
arraySum(arr, 4) = 4 + 6 = 10
arraySum(arr, 5) = 5 + 10 = 15
*/

    public static void main(String[] args) {

        int sonuc = faktoriyel(5);
        System.out.println("5! = " + sonuc);

        int fib_sonuc = fibonacci(6);
        System.out.println("Fibonacci(6) = " + fib_sonuc);

        int[] arr = {1, 2, 3, 4, 5};
        int toplam = arraySum(arr, arr.length);
        System.out.println("Dizideki elemanların toplamı: " + toplam);
    }
}



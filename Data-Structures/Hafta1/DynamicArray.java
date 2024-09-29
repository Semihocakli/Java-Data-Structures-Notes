package Hafta1;
/*
Dinamik dizi, tutabileceği eleman sayısının derleme zamanında bilinmesine gerek olmayan dizidir.
Dinamik dizi tanımlandığında, kapasitesini belirten bir bellek tahsis edilir ve
kullanımda kapasiteye erişildiğinde yeniden bir dinamik bellek tahsisi yapılır.
 */
class DynamicArray {
    private int arr[];
    private int count;

    public DynamicArray() {
        arr = new int[2];
        count = 0;
    }

    public void insert(int element) {
        if (arr.length == count) {
            int newArr[] = new int[2 * count];

            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }
        arr[count++] = element;
    }

    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.insert(10);
        da.insert(20);
        da.insert(30);
        da.insert(40);
        da.printArray();
    }
}
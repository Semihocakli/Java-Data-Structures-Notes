package Hafta6;

class BinaryTreeArray {
    private int[] tree;  // Ağaç düğümlerini saklayan dizi
    private int size;    // Ağacın mevcut boyutu

    // Yapıcı metod: Dizi boyutunu başlatır ve ilk değerleri atar
    public BinaryTreeArray(int capacity) {
        tree = new int[capacity];  // Kapasiteye göre dizi oluşturulur
        size = 0;  // Başlangıçta ağaç boş
    }

    // Ağaca düğüm ekleme metodu
    public void add(int data) {
        if (size == tree.length) {
            System.out.println("Ağaç dolu, eleman eklenemez.");
            return;
        }
        tree[size++] = data;  // Veriyi mevcut boyuta ekler ve boyutu bir artırır
    }

    // Sol çocuk düğümü bulma (indeks hesaplama)
    private int getLeftChildIndex(int index) {
        int leftIndex = 2 * index + 1;  // Sol çocuğun indeksi (2 * index + 1)
        if (leftIndex < size) {
            return leftIndex;
        }
        return -1;  // Eğer sol çocuk yoksa -1 döner
    }

    // Sağ çocuk düğümü bulma (indeks hesaplama)
    private int getRightChildIndex(int index) {
        int rightIndex = 2 * index + 2;  // Sağ çocuğun indeksi (2 * index + 2)
        if (rightIndex < size) {
            return rightIndex;
        }
        return -1;  // Eğer sağ çocuk yoksa -1 döner
    }

    // Ağacı preorder şekilde gezdirme
    public void preorderTraversal(int index) {
        if (index >= size || index < 0) {
            return;
        }
        // Kök düğümü yazdırır
        System.out.print(tree[index] + " ");

        // Sol alt ağacı gezer
        preorderTraversal(getLeftChildIndex(index));

        // Sağ alt ağacı gezer
        preorderTraversal(getRightChildIndex(index));
    }

    // Ağacı inorder şekilde gezdirme
    public void inorderTraversal(int index) {
        if (index >= size || index < 0) {
            return;
        }

        // Sol alt ağacı gezer
        inorderTraversal(getLeftChildIndex(index));

        // Kök düğümü yazdırır
        System.out.print(tree[index] + " ");

        // Sağ alt ağacı gezer
        inorderTraversal(getRightChildIndex(index));
    }

    // Ağacı postorder şekilde gezdirme
    public void postorderTraversal(int index) {
        if (index >= size || index < 0) {
            return;
        }

        // Sol alt ağacı gezer
        postorderTraversal(getLeftChildIndex(index));

        // Sağ alt ağacı gezer
        postorderTraversal(getRightChildIndex(index));

        // Kök düğümü yazdırır
        System.out.print(tree[index] + " ");
    }

    // Ağacı yazdırma işlemi (preorder traversal kullanılarak)
    public void printTree() {
        System.out.print("Ağaç (Preorder): ");
        preorderTraversal(0);  // Ağaç kökünden başlar
        System.out.println();
    }
}
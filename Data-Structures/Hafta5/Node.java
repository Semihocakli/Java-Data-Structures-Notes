package Hafta5;

class Node {
    int data;       // Düğümün taşıdığı veri
    Node next;      // Sonraki düğüme işaret eden referans

    // Düğüm oluşturucu (constructor)
    public Node(int data) {
        this.data = data;  // Veriyi atar
        this.next = null;  // Başlangıçta sonraki düğüm null olur
    }
}
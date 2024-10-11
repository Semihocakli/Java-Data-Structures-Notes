package Hafta4;

// Node sınıfı, bağlı listedeki her bir düğümü (node) temsil eder
// Node sınıfı, çift yönlü bağlı listedeki her bir düğümü temsil eder
public class Node {
    int data;       // Düğümdeki veri
    Node next;      // Sonraki düğüme işaret eden referans
    Node prev;      // Önceki düğüme işaret eden referans

    // Yapıcı metot, düğüme veri ekler ve next ve prev referanslarını başlangıçta null yapar
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


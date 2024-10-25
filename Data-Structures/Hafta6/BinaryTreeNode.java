package Hafta6;

// Düğüm sınıfı
class Node {
    int data;       // Düğümün veri kısmı
    Node left, right;   // Sol ve sağ çocuklar

    // Yapıcı metot, düğüme veri ekler ve çocukları başlangıçta null yapar
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Binary Tree sınıfı
class BinaryTree {
    Node root;   // Ağacın kök düğümü

    // Preorder traversal (Kök, Sol, Sağ)
    void preorderTraversal(Node root) {
        if (root == null) return;  // Eğer düğüm boşsa geri dön
        System.out.print(root.data + " ");  // Kök düğümü yazdır
        preorderTraversal(root.left);  // Sol alt ağacı gez
        preorderTraversal(root.right);  // Sağ alt ağacı gez
    }

    // Inorder traversal (Sol, Kök, Sağ)
    void inorderTraversal(Node root) {
        if (root == null) return;  // Eğer düğüm boşsa geri dön
        inorderTraversal(root.left);  // Sol alt ağacı gez
        System.out.print(root.data + " ");  // Kök düğümü yazdır
        inorderTraversal(root.right);  // Sağ alt ağacı gez
    }

    // Postorder traversal (Sol, Sağ, Kök)
    void postorderTraversal(Node root) {
        if (root == null) return;  // Eğer düğüm boşsa geri dön
        postorderTraversal(root.left);  // Sol alt ağacı gez
        postorderTraversal(root.right);  // Sağ alt ağacı gez
        System.out.print(root.data + " ");  // Kök düğümü yazdır
    }
}



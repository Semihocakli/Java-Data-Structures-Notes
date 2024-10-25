package Hafta6;

public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();  // Öncelikli kuyruk oluşturulur

        pq.insert(10, 3);  // 10 verisi öncelik 3 ile eklenir
        pq.insert(5, 1);   // 5 verisi öncelik 1 ile eklenir (daha yüksek öncelik)
        pq.insert(20, 2);  // 20 verisi öncelik 2 ile eklenir

        System.out.println(pq.peek());  // En yüksek öncelikli eleman: 5
        System.out.println(pq.remove());  // En yüksek öncelikli eleman çıkarılır: 5
        System.out.println(pq.peek());  // Kalan en yüksek öncelikli eleman: 20

        System.out.println("-----------------------------------------------------------");

        BinaryTreeArray binaryTree = new BinaryTreeArray(7);

        // Ağaca düğüm eklemeleri yapılıyor
        binaryTree.add(1);  // Root
        binaryTree.add(2);  // Sol çocuk
        binaryTree.add(3);  // Sağ çocuk
        binaryTree.add(4);  // Sol çocuk'un sol çocuğu
        binaryTree.add(5);  // Sol çocuk'un sağ çocuğu
        binaryTree.add(6);  // Sağ çocuk'un sol çocuğu
        binaryTree.add(7);  // Sağ çocuk'un sağ çocuğu

        // Ağacı preorder, inorder ve postorder şekilde gezdirme işlemleri
        System.out.print("Preorder Traversal: ");
        binaryTree.preorderTraversal(0);
        System.out.println(); // 1 2 4 5 3 6 7

        System.out.print("Inorder Traversal: ");
        binaryTree.inorderTraversal(0);
        System.out.println(); // 4 2 5 1 6 3 7

        System.out.print("Postorder Traversal: ");
        binaryTree.postorderTraversal(0);
        System.out.println(); // 4 5 2 6 7 3 1

        System.out.println("-----------------------------------------------------------");

        BinaryTree tree = new BinaryTree();  // BinaryTree nesnesi oluşturulur

        // Ağacın kök düğümü oluşturulur
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Gezinme işlemlerini test edelim
        System.out.println("Preorder traversal of binary tree is:");
        tree.preorderTraversal(tree.root);  // Preorder gezinme
        // 1 2 4 5 3

        System.out.println("\nInorder traversal of binary tree is:");
        tree.inorderTraversal(tree.root);  // Inorder gezinme
        // 4 2 5 1 3

        System.out.println("\nPostorder traversal of binary tree is:");
        tree.postorderTraversal(tree.root);  // Postorder gezinme
        // 4 5 2 3 1

    }
}

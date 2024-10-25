
Binary Tree'de ifadelerin (expression) gösterimi ve çözümünde en çok kullanılan yöntemlerden biri İfade Ağaçları (Expression Trees) oluşturmak ve bu ağaçlarda işlem yapmak. Bu ağaçlar, aritmetik ifadeleri temsil eder ve her düğüm, bir operatör veya operand (sayı) içerir. İfade ağacında yaprak düğümler operandları (sayıları), iç düğümler ise operatörleri (toplama, çarpma vb.) temsil eder.

Bir expression tree genellikle şu üç gezinti yöntemiyle kullanılır:

* Preorder: Operatör önce, operandlar sonra (Prefix Notation)
* Inorder: Operatör operandların arasında (Infix Notation)
* Postorder: Operandlar önce, operatör sonra (Postfix Notation)

#### Örnek: İfade Ağacı Oluşturma
Verilen bir aritmetik ifadeyi, bir binary tree'de nasıl ifade edebileceğimize bakalım:

İfade: (a + b) * (c - d)
Bu ifadeyi bir binary expression tree olarak şu şekilde temsil ederiz:
````
        *
       / \
      +   -
     / \ / \
    a  b c  d
````
* Kök düğümde * operatörü vardır, bu operatör sağ ve sol alt ağaçları çarpar.
* Sol alt ağaç (a + b) ifadesini, sağ alt ağaç (c - d) ifadesini temsil eder.

### 1. Expression Tree Kod Örneği:
   Aşağıdaki kod, bir ifade ağacı oluşturur ve preorder, inorder, postorder işlemlerini uygular.
````
// Node sınıfı, expression ağacındaki her bir düğümü temsil eder
class Node {
    String value;  // Düğümde saklanan değer (operand veya operatör)
    Node left, right;  // Sol ve sağ çocuk düğümler

    // Yapıcı metot, düğüme değer ekler ve çocukları null olarak başlatır
    Node(String item) {
        value = item;
        left = right = null;
    }
}

// Expression Tree sınıfı
class ExpressionTree {

    // Inorder traversal (operandlar operatörlerin arasında - infix)
    void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);  // Sol alt ağacı gez
        System.out.print(root.value + " ");  // Kök düğümü yazdır
        inorderTraversal(root.right);  // Sağ alt ağacı gez
    }

    // Preorder traversal (operatör önce - prefix)
    void preorderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.value + " ");  // Kök düğümü yazdır
        preorderTraversal(root.left);  // Sol alt ağacı gez
        preorderTraversal(root.right);  // Sağ alt ağacı gez
    }

    // Postorder traversal (operatör sonra - postfix)
    void postorderTraversal(Node root) {
        if (root == null) return;
        postorderTraversal(root.left);  // Sol alt ağacı gez
        postorderTraversal(root.right);  // Sağ alt ağacı gez
        System.out.print(root.value + " ");  // Kök düğümü yazdır
    }

    // Ana metot - Expression Tree oluşturarak gezinmeleri göster
    public static void main(String[] args) {
    
        // İfade ağacını oluşturalım: (a + b) * (c - d)
        
        Node root = new Node("*");  // Kök düğüm (*)
        root.left = new Node("+");  // Sol çocuk (+)
        root.left.left = new Node("a");  // Sol alt çocuk (a)
        root.left.right = new Node("b");  // Sağ alt çocuk (b)
        root.right = new Node("-");  // Sağ çocuk (-)
        root.right.left = new Node("c");  // Sol alt çocuk (c)
        root.right.right = new Node("d");  // Sağ alt çocuk (d)

        ExpressionTree tree = new ExpressionTree();

        // Inorder gezinme (a + b) * (c - d)
        System.out.println("Inorder traversal (infix notation):");
        tree.inorderTraversal(root);
        System.out.println();

        // Preorder gezinme * + a b - c d
        System.out.println("Preorder traversal (prefix notation):");
        tree.preorderTraversal(root);
        System.out.println();

        // Postorder gezinme a b + c d - *
        System.out.println("Postorder traversal (postfix notation):");
        tree.postorderTraversal(root);
    }
}
````

### 2. Gezinme Sonuçları:
   * Inorder (Infix Notation): (a + b) * (c - d)
   * Preorder (Prefix Notation): * + a b - c d
   * Postorder (Postfix Notation): a b + c d - *


package Hafta4;

public class Main {
    public static void main(String[] args) {
        DiziforStack stack = new DiziforStack(5); // 5 elemanlık bir yığın oluşturur

        stack.push(10);  // Yığına 10 ekler
        stack.push(20);  // Yığına 20 ekler
        stack.push(30);  // Yığına 30 ekler

        stack.printStack();  // Yığın: 10 20 30

        System.out.println("En üstteki eleman: " + stack.peek());  // En üstteki eleman: 30

        stack.pop();  // En üstteki elemanı (30) yığından çıkarır
        stack.printStack();  // Yığındaki mevcut elemanları tekrar yazdırır

        stack.pop();
        stack.pop();

        stack.printStack();  // Yığın: 20 10

        System.out.println("Yığın boş mu? " + stack.isEmpty());  // Yığın boş mu? false

        System.out.println("---------------------------------------------------------");

        LinkedListStack stackList = new LinkedListStack();  // Stack (yığın) oluşturulur

        stackList.push(10);  // Yığına 10 ekler
        stackList.push(20);  // Yığına 20 ekler
        stackList.push(30);  // Yığına 30 ekler

        stackList.printStack();  // Yığın: 30 20 10

        System.out.println("En üstteki eleman: " + stackList.peek());  // En üstteki eleman: 30

        System.out.println(stackList.pop() + " yığından çıkarıldı.");  // 30 yığından çıkarıldı.

        stackList.printStack();  // Yığın: 20 10

        System.out.println("Yığın boş mu? " + stackList.isEmpty());  // Yığın boş mu? false

        System.out.println("---------------------------------------------------------");

        StackForDoubleLinkedList stackListDouble = new StackForDoubleLinkedList();  // Çift yönlü yığın oluşturulur

        stackListDouble.push(10);  // Yığına 10 eklenir
        stackListDouble.push(20);  // Yığına 20 eklenir
        stackListDouble.push(30);  // Yığına 30 eklenir

        stackListDouble.printStack();  // Yığın: 30 20 10

        System.out.println("En üstteki eleman: " + stackListDouble.peek());  // En üstteki eleman: 30

        System.out.println(stackListDouble.pop() + " yığından çıkarıldı.");  // 30 yığından çıkarıldı

        stackListDouble.printStack();  // Yığın: 20 10

        System.out.println("Yığın boş mu? " + stackListDouble.isEmpty());  // Yığın boş mu? false


    }
}

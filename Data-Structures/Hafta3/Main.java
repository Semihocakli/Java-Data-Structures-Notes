package hafta3;

public class Main {
    public static void main(String[] args) {
        CiftYonluBagliList list = new CiftYonluBagliList();

        // Başa ekleme
        System.out.println("Başa ekleme:");
        list.addToHead(10);
        list.addToHead(5);
        list.printList(); // Output: 5 10

        // Sona ekleme
        System.out.println("Sona ekleme:");
        list.addToTail(20);
        list.addToTail(30);
        list.printList(); // Output: 5 10 20 30

        // Ortaya ekleme (Pozisyon 2'ye ekleme)
        System.out.println("Ortaya ekleme (pozisyon 2):");
        list.addToMiddle(15, 2);
        list.printList(); // Output: 5 10 15 20 30

        // Baştan silme
        System.out.println("Baştan silme:");
        list.removeFromHead();
        list.printList(); // Output: 10 15 20 30

        // Sondan silme
        System.out.println("Sondan silme:");
        list.removeFromTail();
        list.printList(); // Output: 10 15 20

        // Ortadan silme (Pozisyon 1'den)
        System.out.println("Ortadan silme (pozisyon 1):");
        list.removeFromMiddle(1);
        list.printList(); // Output: 10 20
    }
}


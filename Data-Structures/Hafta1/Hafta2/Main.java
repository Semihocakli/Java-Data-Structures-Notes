package Hafta2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Başa ekleme
        list.BasaEkleme(10);
        list.BasaEkleme(20);
        list.BasaEkleme(30);
        System.out.println("Başa ekleme sonrası:");
        list.printList(); // 30 -> 20 -> 10 -> null

        // Sona ekleme
        list.SonaEkleme(40);
        list.SonaEkleme(50);
        System.out.println("Sona ekleme sonrası:");
        list.printList(); // 30 -> 20 -> 10 -> 40 -> 50 -> null

        // Ortaya ekleme (2. pozisyondan sonra)
        list.OrtayaEkleme(25, 2);
        System.out.println("Ortaya ekleme (2. pozisyondan sonra) sonrası:");
        list.printList(); // 30 -> 20 -> 25 -> 10 -> 40 -> 50 -> null

        list.BastanSilme();
        System.out.println("Baştan silme sonrası:");
        list.printList(); // Listeyi yazdırır: 20 -> 25 -> 10 -> 40 -> 50 -> null

        // Sondan silme işlemi
        list.SondanSilme();
        System.out.println("Sondan silme sonrası:");
        list.printList(); // 20 -> 25 -> 10 -> 40 -> null

        // Ortadan silme işlemi (1. pozisyondaki düğümü siler)
        list.OrtadanSilme(1);
        System.out.println("Ortadan silme sonrası (1. pozisyon):");
        list.printList(); // Listeyi yazdırır: 20 -> 10 -> 40 -> null

        // Arama işlemi
        list.Arama(20); // 20 değeri 0. pozisyonda bulundu.
        list.Arama(50); // 50 değeri listede bulunamadı.
    }
}

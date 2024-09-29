package JavaTutorial;

public class HesapMakinesi {
    int sayi1 , sayi2;
    public int topla(int x, int y){
        this.sayi1 = x;
        this.sayi2 = y;
        return x+y;
    }
    public int cikart(){
        return sayi1-sayi2;
    }
    public int carp(int x, int y){
        sayi1 = x;
        sayi2 = y;
        return x*y;
    }
    public int bol(int x, int y){
        this.sayi1 = x;
        this.sayi2 = y;
        return x/y;
    }
    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        System.out.println(hesapMakinesi.bol(50,4));
        //System.out.println(hesapMakinesi.sayi1= 5);
        System.out.println(hesapMakinesi.bol(50, hesapMakinesi.sayi1));
        //hesapMakinesi.sayi2 = 10;
        System.out.println(hesapMakinesi.cikart());
        System.out.println(hesapMakinesi.carp(10,2));

        int topla = hesapMakinesi.topla(5,3);
        System.out.println(topla);
    }
}


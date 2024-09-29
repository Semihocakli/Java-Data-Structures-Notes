package oop;

public class Encapsulation {
    private String renk;
    private int hiz;

    // Getter metodu: renk değişkenine erişim sağlar
    public String getRenk() {
        return renk;
    }

    // Setter metodu: renk değişkenine değer atar
    public void setRenk(String renk) {
        this.renk = renk;
    }

    // Getter metodu: hiz değişkenine erişim sağlar
    public int getHiz() {
        return hiz;
    }

    // Setter metodu: hiz değişkenine değer atar, negatif hız engellenir
    public void setHiz(int hiz) {
        if (hiz > 0) {
            this.hiz = hiz;
        } else {
            System.out.println("Hız negatif olamaz!");
        }
    }
    public static void main(String[] args) {
        // Araba nesnesi oluşturma
        Encapsulation benimArabam = new Encapsulation();

        // Setter metotları ile özellik atama
        benimArabam.setRenk("Mavi");
        benimArabam.setHiz(100);

        // Getter metotları ile özellik okuma
        System.out.println("Arabanın rengi: " + benimArabam.getRenk());
        System.out.println("Arabanın hızı: " + benimArabam.getHiz());

        // Hatalı hız atama
        benimArabam.setHiz(-50);  // Negatif hız engellenir
    }
    /* ÇIKTI:
    Arabanın rengi: Mavi
    Arabanın hızı: 100
    Hız negatif olamaz!
     */
}

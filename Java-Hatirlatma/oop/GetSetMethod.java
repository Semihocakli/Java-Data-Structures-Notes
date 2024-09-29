package oop;

public class GetSetMethod {
    private String marka;
    private String model;
    private int hiz;

    // Constructor
    public GetSetMethod(String marka, String model, int hiz) {
        this.marka = marka;
        this.model = model;
        this.hiz = hiz;
    }

    // Getter metodları
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getHiz() {
        return hiz;
    }
    public static void main(String[] args) {
        GetSetMethod araba = new GetSetMethod("BMW", "X5", 200);

        // Getter metodları ile özelliklere erişim
        String marka = araba.getMarka();
        String model = araba.getModel();
        int hiz = araba.getHiz();

        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Hız: " + hiz);
    }
}

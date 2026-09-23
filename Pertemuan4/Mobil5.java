package Pertemuan4;

public class Mobil5 {
    private String merek;
    private Mesin5 mesin;

    public Mobil5(String merek) {
        this.merek = merek;
        this.mesin = new Mesin5();
    }

    public Mobil5(String merek, Mesin5 mesin) {
        this.merek = merek;
        this.mesin = mesin;
    }

    public void tampilkanInfo() {
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin: " +mesin.getTipe());
    }
}

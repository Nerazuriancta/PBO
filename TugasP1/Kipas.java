package TugasP1;

public class Kipas {
    private String merek;
    private int kecepatan;

    //Konstuktor
    public Kipas(String merek, int kecepatan) {
        this.merek = merek;
        this.kecepatan = kecepatan;
    }

    //Getter dan Setter
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    //method 1
    public void nyalakan() {
        System.out.println("Kipas " + merek + " dinyalakan.");
    }
    //method 2
    public void ubahKecepatan(int kecepatanBaru) {
        this.kecepatan = kecepatanBaru;
        System.out.println("Kecepatan kipas diubah menjadi " + this.kecepatan);
    }
    //method 3
    public void cetakInformasi() {
        System.out.println("=== KIPAS ===");
        System.out.println("Merek       : " + merek);
        System.out.println("Kecepatan   : " + kecepatan);
    }
}

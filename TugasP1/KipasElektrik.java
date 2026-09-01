package TugasP1;

public class KipasElektrik extends Kipas{
    private int kapasitasBaterai;
    private double berat;

    //konstruktor
    public KipasElektrik(String merek, int kecepatan, int kapasitasBaterai, double berat) {
        super(merek, kecepatan);
        this.kapasitasBaterai = kapasitasBaterai;
        this.berat = berat;
    }

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    //method 1
    public void isiDaya() {
        System.out.println("Kipas elektrik sedang diisi daya.");
    }
    //method 2
    public void cekBaterai() {
        System.out.println("Kapasitas baterai   : " + kapasitasBaterai + " mAh");
    }
    //method 3
    @Override
    public void cetakInformasi() {
        System.out.println("=== KIPAS ELEKTRIK ===");
        System.out.println("Merek               : " + getMerek());
        System.out.println("Kecepatan           : " + getKecepatan());
        System.out.println("Kapasitas Baterai   : " + kapasitasBaterai + " mAh");
        System.out.println("Berat               : " + berat + " kg");
    }
}

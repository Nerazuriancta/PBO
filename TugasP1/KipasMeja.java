package TugasP1;

public class KipasMeja extends Kipas{
    private double diameterKipas;
    private int jumlahTingkatKecepatan;

    // Constructor
    public KipasMeja(String merek, int kecepatan,
                     double diameterKipas,
                     int jumlahTingkatKecepatan) {

        super(merek, kecepatan);

        this.diameterKipas = diameterKipas;
        this.jumlahTingkatKecepatan =
                jumlahTingkatKecepatan;
    }

    // Getter dan Setter
    public double getDiameterKipas() {
        return diameterKipas;
    }

    public void setDiameterKipas(double diameterKipas) {
        this.diameterKipas = diameterKipas;
    }

    public int getJumlahTingkatKecepatan() {
        return jumlahTingkatKecepatan;
    }

    public void setJumlahTingkatKecepatan(
            int jumlahTingkatKecepatan) {

        this.jumlahTingkatKecepatan =
                jumlahTingkatKecepatan;
    }

    // Method 1
    public void putarKipas() {
        System.out.println("Kipas meja sedang berputar.");
    }

    // Method 2
    public void tampilkanTingkatKecepatan() {
        System.out.println("Kipas meja memiliki " + jumlahTingkatKecepatan + " tingkat kecepatan.");
    }

    // Method 3
    @Override
    public void cetakInformasi() {
        System.out.println("=== KIPAS MEJA ===");

        System.out.println("Merek                    : " + getMerek());

        System.out.println("Kecepatan                : " + getKecepatan());

        System.out.println("Diameter Kipas           : " + diameterKipas + " cm");

        System.out.println("Jumlah Tingkat Kecepatan : " + jumlahTingkatKecepatan);
    }
}

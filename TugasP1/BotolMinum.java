package TugasP1;

public class BotolMinum {
    private int kapasitas;
    private int isiMinuman;

    // Constructor
    public BotolMinum(int kapasitas, int isiMinuman) {
        this.kapasitas = kapasitas;
        this.isiMinuman = isiMinuman;
    }

    // Getter dan Setter
    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getIsiMinuman() {
        return isiMinuman;
    }

    public void setIsiMinuman(int isiMinuman) {
        this.isiMinuman = isiMinuman;
    }

    // Method 1
    public void minum(int jumlah) {
        isiMinuman -= jumlah;

        if (isiMinuman < 0) {
            isiMinuman = 0;
        }

        System.out.println(jumlah + " ml minuman telah diminum.");
    }

    // Method 2
    public void isiBotol(int jumlah) {
        isiMinuman += jumlah;

        if (isiMinuman > kapasitas) {
            isiMinuman = kapasitas;
        }

        System.out.println(jumlah + " ml minuman ditambahkan ke botol.");
    }

    // Method 3
    public void cetakInformasi() {
        System.out.println("=== BOTOL MINUM ===");
        System.out.println("Kapasitas   : " + kapasitas + " ml");
        System.out.println("Isi Minuman : " + isiMinuman + " ml");
    }
}

package TugasP1;

public class Sandal {
    private String warna;
    private int ukuran;

    // Constructor
    public Sandal(String warna, int ukuran) {
        this.warna = warna;
        this.ukuran = ukuran;
    }

    // Getter dan Setter
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    // Method 1
    public void pakai() {
        System.out.println("Sandal sedang dipakai.");
    }

    // Method 2
    public void lepas() {
        System.out.println("Sandal dilepas.");
    }

    // Method 3
    public void cetakInformasi() {
        System.out.println("=== SANDAL ===");
        System.out.println("Warna  : " + warna);
        System.out.println("Ukuran : " + ukuran);
    }
}

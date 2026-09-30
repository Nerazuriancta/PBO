package TugasP4;

public class Pembayaran {
    private String metode;

    public Pembayaran(String metode) {
        this.metode = metode;
    }

    public void prosesPembayaran() {
        System.out.println("Pembayaran menggunakan " +metode);
    }
}

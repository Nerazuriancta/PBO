package TugasP4;

public class MainTokoOnline {
    public static void main(String[] args) {
        Pelanggan p = new Pelanggan("Nera");
        TokoOnline toko = new TokoOnline("Nera Store", p);
        toko.tambahBarang(3);
        Pembayaran pembayaran = new Pembayaran("QRIS");

        toko.checkout(pembayaran);
    }
}

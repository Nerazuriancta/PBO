package TugasP4;

public class TokoOnline {
    private String namaToko;
    private Pelanggan pelanggan;
    private Keranjang keranjang;

    public TokoOnline(String namaToko, Pelanggan pelanggan) {
        this.namaToko = namaToko;
        this.pelanggan = pelanggan;
        this.keranjang = new Keranjang();
    }

    public void tambahBarang(int jumlah) {
        keranjang.tambahBarang(jumlah);
    }

    public void checkout(Pembayaran pembayaran) {
        System.out.println("Toko: "+namaToko);
        System.out.println("Pelanggan: "+pelanggan.getNama());
        keranjang.tampilkanInfo();

        pembayaran.prosesPembayaran();
        System.out.println("Checkout berhasil.");
    }
}

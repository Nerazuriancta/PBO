package TugasP4;

public class Keranjang {
    private int jumlahBarang;

    public Keranjang() {
        this.jumlahBarang = 0;
    }

    public void tambahBarang(int jumlah) {
        jumlahBarang += jumlah;
    }

    public void tampilkanInfo() {
        System.out.println("Jumlah barang: " + jumlahBarang);
    }
}

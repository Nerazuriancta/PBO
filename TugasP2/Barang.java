package TugasP2;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float laba;

    public int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar+(laba*hargaDasar));
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode Barang : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : "+hargaDasar);
        System.out.println("Laba        : "+laba);
        System.out.println("Harga Jual  : "+hitungHargaJual());
    }
}
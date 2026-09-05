package TugasP2;

public class MainBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();

        brg1.kode = "B001";
        brg1.namaBarang = "Laptop";
        brg1.hargaDasar = 50000000;
        brg1.laba = 0.10f;
        brg1.tampilData();
    }
}

package latihan;

public class BukuMain {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Bumi Samudra", "Tyara Elek", 75000);

        buku1.tampilkanInfo();
        buku1.setHarga(85000);
        buku1.getHarga();
        System.out.println(buku1.getJudul());
    }
}

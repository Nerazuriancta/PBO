package TugasP6;

public class TestTiket {
    public static void main(String[] args) {

        // Tiket kereta
        // Menggunakan konstruktor tanpa parameter
        TiketKereta kereta = new TiketKereta();

        kereta.kodeTiket = "KA-001";
        kereta.namaPenumpang = "Andi";
        kereta.asal = "Malang";
        kereta.tujuan = "Jakarta";
        kereta.hargaDasar = 350000;
        kereta.nomorGerbong = 3;
        kereta.nomorKursi = "12A";

        // Tiket pesawat domestik
        Tiket tiketDomestik = new Tiket(
                "GA-102", "Sinta", "Surabaya", "Denpasar", 900000);

        TiketPesawat pesawatDomestik = new TiketPesawat(
                tiketDomestik, "Garuda Indonesia", 25);

        TiketDomestik domestik = new TiketDomestik(
                pesawatDomestik, 75000);

        // Tiket pesawat internasional
        Tiket tiketInternasional = new Tiket(
                "SQ-205", "Budi", "Jakarta", "Singapura", 2500000);

        TiketPesawat pesawatInternasional = new TiketPesawat(
                tiketInternasional, "Singapore Airlines", 20);

        TiketInternasional internasional = new TiketInternasional(
                pesawatInternasional, "C1234567", 150000);

        System.out.println("============ Tiket Kereta ============");
        kereta.tampilKereta();

        System.out.println("======== Tiket Pesawat Domestik ========");
        domestik.tampilDomestik();

        System.out.println("====== Tiket Pesawat Internasional ======");
        internasional.tampilInternasional();
    }
}

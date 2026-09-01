package TugasP1;

public class Demo {
    public static void main(String[] args) {
        // Membuat object setiap class
        System.out.println("=== KIPAS ===");
        Kipas kipas = new Kipas("Miyako", 1);
        kipas.nyalakan();
        kipas.ubahKecepatan(2);
        kipas.cetakInformasi();

        System.out.println();

        System.out.println("=== KIPAS ELEKTRIK ===");
        KipasElektrik kipasElektrik = new KipasElektrik("Miniso",2,
        2000,0.2);
        kipasElektrik.nyalakan();
        kipasElektrik.ubahKecepatan(3);
        kipasElektrik.isiDaya();
        kipasElektrik.cekBaterai();
        kipasElektrik.cetakInformasi();

        System.out.println();

        System.out.println("=== KIPAS MEJA ===");
        KipasMeja kipasMeja = new KipasMeja("Cosmos",1,30,3);
        kipasMeja.nyalakan();
        kipasMeja.ubahKecepatan(2);
        kipasMeja.putarKipas();
        kipasMeja.tampilkanTingkatKecepatan();
        kipasMeja.cetakInformasi();

        System.out.println();

        System.out.println("=== BOTOL MINUM ===");
        BotolMinum botol = new BotolMinum(1000,800);
        botol.minum(200);
        botol.isiBotol(100);
        botol.cetakInformasi();

        System.out.println();

        System.out.println("=== SANDAL ===");
        Sandal sandal = new Sandal("Abu-abu",39);
        sandal.pakai();
        sandal.lepas();
        sandal.cetakInformasi();
    }
}
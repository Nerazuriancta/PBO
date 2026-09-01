package TugasP1;

public class Demo {
    public static void main(String[] args) {
        // Membuat object setiap class
        Kipas kipas = new Kipas("Miyako", 1);

        KipasElektrik kipasElektrik = new KipasElektrik("Miniso",2,
        2000,0.2);

        KipasMeja kipasMeja = new KipasMeja("Cosmos",1,30,3);

        BotolMinum botol = new BotolMinum(1000,800);

        Sandal sandal = new Sandal("Abu-abu",39);


        System.out.println("===== DEMO KIPAS =====");
        kipas.nyalakan();
        kipas.ubahKecepatan(2);
        kipas.cetakInformasi();

        System.out.println();

        System.out.println("===== DEMO KIPAS ELEKTRIK =====");
        kipasElektrik.nyalakan();
        kipasElektrik.ubahKecepatan(3);
        kipasElektrik.isiDaya();
        kipasElektrik.cekBaterai();
        kipasElektrik.cetakInformasi();

        System.out.println();

        System.out.println("===== DEMO KIPAS MEJA =====");
        kipasMeja.nyalakan();
        kipasMeja.ubahKecepatan(2);
        kipasMeja.putarKipas();
        kipasMeja.tampilkanTingkatKecepatan();
        kipasMeja.cetakInformasi();

        System.out.println();

        System.out.println("===== DEMO BOTOL MINUM =====");
        botol.minum(200);
        botol.isiBotol(100);
        botol.cetakInformasi();

        System.out.println();

        System.out.println("===== DEMO SANDAL =====");
        sandal.pakai();
        sandal.lepas();
        sandal.cetakInformasi();
    }
}

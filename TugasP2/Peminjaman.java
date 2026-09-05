package TugasP2;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public double harga;

    public  double hitungHarga(int lamaSewa) {
        return lamaSewa * harga;
    }

    public void tampilPeminjaman(int lamaSewa) {
        System.out.println("ID          : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game   : "+namaGame);
        System.out.println("Harga       : "+harga);
        System.out.println("Lama Sewa   : "+lamaSewa+" hari");
        System.out.println("Total Bayar : "+hitungHarga(lamaSewa));
    }
}

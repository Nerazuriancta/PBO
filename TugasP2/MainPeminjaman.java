package TugasP2;

public class MainPeminjaman {
    public static void main(String[] args) {
        Peminjaman pnjm1 = new Peminjaman();

        pnjm1.id = 101;
        pnjm1.namaMember = "Nera";
        pnjm1.namaGame = "GTA V";
        pnjm1.harga = 10000;
        int lamaSewa = 3;
        pnjm1.tampilPeminjaman(lamaSewa);
    }
}

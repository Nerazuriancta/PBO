package latihan;

public class MahasiswaMain2 {
    public static void main(String[] args) {
        Mahasiswa2 mhs = new Mahasiswa2("Nera", "254...", "Probolinggo");
        Dosen dsn = new Dosen("Pak Dimas", "123");
        MataKuliah matkul = new MataKuliah("MK011", "DWP", 3);

        mhs.setDosen(dsn);
        mhs.setMataKuliah(matkul);
        mhs.tampilkanInfo();
    }
}
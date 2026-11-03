package TugasP7.Tugas2;

public class Main {

    public static void main(String[] args) {

        Manusia manusia;
        // Object Dosen
        manusia = new Dosen();
        manusia.bernafas();
        manusia.makan();

        System.out.println();

        // Object Mahasiswa
        manusia = new Mahasiswa();
        manusia.bernafas();
        manusia.makan();

        System.out.println();

        // Mengakses method khusus Dosen
        Dosen dosen = new Dosen();
        dosen.makan();
        dosen.lembur();

        System.out.println();

        // Mengakses method khusus Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tidur();
    }
}
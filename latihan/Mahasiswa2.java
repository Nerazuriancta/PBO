package latihan;

public class Mahasiswa2 {
    private String nama;
    private String nim;
    private String alamat;
    private Dosen dosen;
    private MataKuliah matkul;

    public Mahasiswa2(String nama, String nim, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public void setMataKuliah(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public void tampilkanInfo() {
        System.out.println("Nama    : "+nama);
        System.out.println("NIM     : "+nim);
        System.out.println("Alamat  : "+alamat);
        dosen.tampilkanInfo();
        matkul.tampilkanInfo();
    }
}

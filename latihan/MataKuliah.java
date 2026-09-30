package latihan;

public class MataKuliah {
    private String kodeMatkul;
    private String namaMatkul;
    private int jumlahSks;

    public MataKuliah(String kodeMatkul, String namaMatkul, int jumlahSks) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.jumlahSks = jumlahSks;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }

    public void setJumlahSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Matkul     : "+kodeMatkul);
        System.out.println("Nama Matkul     : "+namaMatkul);
        System.out.println("Jumlah SKS      : "+jumlahSks);
    }
}
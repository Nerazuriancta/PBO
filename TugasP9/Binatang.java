package TugasP9;

public abstract class Binatang {
    protected String nama;
    protected int jumlahKaki;
    protected String suara;
    protected String warnaBulu;

    public Binatang(String nama, int jumlahKaki, String suara, String warnaBulu) {
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public String getSuara() {
        return suara;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public abstract void displayMakan();
    public abstract void displayJenis();

    public void displayData() {
        System.out.println("Nama        : " + nama);
        System.out.println("Jumlah Kaki : " + jumlahKaki);
        System.out.println("Suara       : " + suara);
        System.out.println("Warna Bulu  : " + warnaBulu);
    }
}

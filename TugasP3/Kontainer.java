package TugasP3;

public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0;
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public void tambahMuatan(double berat) {
        if (beratMuatanSaatIni + berat > kapasitasMaksimal) {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer!");
        } else {
            beratMuatanSaatIni += berat;
        }
    }

    public void turunkanMuatan(double berat) {
        if (berat > beratMuatanSaatIni) {
            beratMuatanSaatIni = 0;
        } else {
            beratMuatanSaatIni -= berat;
        }
    }
}

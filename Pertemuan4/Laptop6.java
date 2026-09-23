package Pertemuan4;

public class Laptop6 {
    private String merk;
    private Printer printerDefault;

    public Laptop6(String merk, Printer printerDefault) {
        this.merk = merk;
        this.printerDefault = printerDefault;
    }

    public void cetakDokumen(String namaFile) {
        System.out.println(merk + " mengirim dokumen ke printer...");
        printerDefault.cetak(namaFile);
    }
}

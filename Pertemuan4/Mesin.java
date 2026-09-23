package Pertemuan4;

public class Mesin {
    private int kapasitas;
    private String tipeBahanBakar;

    Mesin(int kapasitas, String tipeBahanBakar) {
        this.kapasitas = kapasitas;
        this.tipeBahanBakar = tipeBahanBakar;
    }

    public int getKapasitas() {
        return getKapasitas();
    }

    public void setKapasitas(int kapasitas) {
        if (kapasitas > 0) {
            this.kapasitas = kapasitas;
        } else {
            System.out.println("Kapasitas mesin harus lebih dari 0!");
        }
    }

    public String getTipeBahanBakar() {
        return tipeBahanBakar;
    }

    public void setTipeBahanBakar(String tipeBahanBakar) {
        if (tipeBahanBakar != null && !tipeBahanBakar.isEmpty()) {
            this.tipeBahanBakar = tipeBahanBakar;
        } else {
            System.out.println("Tipe bahan bakar tidak boleh kosong!");
        }
    }

    public  void tampilkanInfo() {
        System.out.println("Kapasitas Mesin     : "+kapasitas+" cc");
        System.out.println("Tipe Bahan Bakar    : "+tipeBahanBakar);
    }
}

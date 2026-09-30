package Pertemuan6.Teori;

public class Komputer {
    protected String merk;
    protected int kapasitasMemory;
    protected double kecepatanCpu;

    public Komputer() {
    }

    Komputer(String merk, int kapasitasMemory, double kecepatanCpu) {
        this.merk = merk;
        this.kapasitasMemory = kapasitasMemory;
        this.kecepatanCpu = kecepatanCpu;
    }

    public void showInfo() {
        System.out.println("Merek               : "+merk);
        System.out.println("Kapasitas Memori    : "+kapasitasMemory);
        System.out.println("Kecepatan CPU       : "+kecepatanCpu);
    }

    public void nyalakanKomputer() {

    }
}
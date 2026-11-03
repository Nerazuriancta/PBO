package TugasP9;

public class Keledai extends Binatang implements IHerbivora{
    public Keledai(String nama, int jumlahKaki, String suara, String WarnaBulu) {
        super(nama, jumlahKaki, suara, WarnaBulu);
    }

    @Override 
    public void displayMakan() {
        System.out.println("Makanan : Tumbuhan");
    }

    @Override 
    public void displayJenis() {
        System.out.println("Jenis : Herbivora");
    }
}

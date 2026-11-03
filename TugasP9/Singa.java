package TugasP9;

public class Singa extends Binatang implements IKarnivora{
    public Singa(String nama, int jumlahKaki, String suara, String warnaBulu) {
        super(nama, jumlahKaki, suara, suara);
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan : Daging");
    }

    @Override
    public void displayJenis() {
        System.out.println("Jenis : Karnivora");
    }
}

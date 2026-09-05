package TugasP2;

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran lkr1 = new Lingkaran();

        lkr1.phi = 3.14;
        lkr1.r = 7;

        System.out.println("Jari-jari   : "+lkr1.r);
        System.out.println("Luas        : "+lkr1.hitungLuas());
        System.out.println("Keliling    : "+lkr1.hitungKeliling());
    }
}

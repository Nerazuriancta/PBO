package TugasP7.Tugas1;

public class Main {
    public static void main(String[] args) {
        
        Segitiga segitiga = new Segitiga();

        // memanggil totalSudut(int)
        System.out.println("Sudut ketiga = "+ segitiga.totalSudut(60));

        // memanggil totalSudut(int, int)
        System.out.println("Sudut ketiga = "+segitiga.totalSudut(60, 70));

        // memanggil keliling(int, int, int)
        System.out.println("Keliling segitiga = "+segitiga.keliling(3, 4, 5));

        // memanggil keliling(int, int)
        System.out.println("Sisi miring = "+segitiga.keliling(3, 4));
    }
}

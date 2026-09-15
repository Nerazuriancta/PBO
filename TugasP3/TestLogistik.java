package TugasP3;

import java.util.Scanner;
public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik: "+kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas maksimal: "+kontainerAlfa.getKapasitasMaksimal()+" kg");

        System.out.print("\nMasukkan berat muatan yang ingin dimasukkan: ");
        double beratMasuk = sc.nextDouble();
        kontainerAlfa.tambahMuatan(beratMasuk);

        System.out.println("Berat muatan saat ini: "+kontainerAlfa.getBeratMuatanSaatIni()+ " kg");

        System.out.print("\nMasukkan berat muatan yang ingin dibongkar: ");
        double beratTurun = sc.nextDouble();
        kontainerAlfa.turunkanMuatan(beratTurun);

        System.out.println("Berat muatan saat ini: "+kontainerAlfa.getBeratMuatanSaatIni()+ " kg");

        sc.close();
    }
}
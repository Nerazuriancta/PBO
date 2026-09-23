package Pertemuan4;

public class MainSepedaMotor {
    public static void main(String[] args) {
        Mesin mesin1 = new Mesin(150, "Pertalite");

        SepedaMotor motor1 = new SepedaMotor("Honda", "Merah", mesin1, 120);

        motor1.tampilkanInfo();
        motor1.tambahKecepatan(50);
        System.out.println("Kecepatan sekarang : "+ motor1.getKecepatan() + " km/jam");

        motor1.tambahKecepatan(100);
        System.out.println("Kecepatan sekarang : "+ motor1.getKecepatan() + " km/jam");

        motor1.kurangiKecepatan(30);
        System.out.println("Kecepatan sekarang : "+ motor1.getKecepatan() + " km/jam");

        motor1.kurangiKecepatan(100);
        System.out.println("Kecepatan sekarang : "+ motor1.getKecepatan() + " km/jam");
    }
}

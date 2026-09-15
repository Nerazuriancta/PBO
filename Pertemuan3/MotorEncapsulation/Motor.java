package Pertemuan3.MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    public boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void MatikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < 120) {
                kecepatan += 5;

                if (kecepatan > 120) {
                    kecepatan = 120;
                }
            } else {
                System.out.println("Kecepatan sudah mencapai maksimal 120 km/h!\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!\n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            if (kecepatan > 0) {
                kecepatan -= 5;

                if (kecepatan < 0) {
                    kecepatan = 0;
                }
            } else {
                System.out.println("Kecepatan sudah mencapai minimal 0 km/h!\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off!\n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+" km/h\n");
    }
}

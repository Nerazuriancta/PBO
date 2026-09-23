package Pertemuan4;

public class SepedaMotor {
    private String merek;
    private String warna;
    private Mesin mesin;
    private int maxSpeed;
    private int kecepatan;

    public SepedaMotor(String merek, String warna, Mesin mesin, int maxSpeed) {
        this.merek = merek;
        this.warna = warna;
        this.mesin = mesin;

        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }

        this.kecepatan = 0;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        if (merek != null && !merek.isEmpty()) {
            this.merek = merek;
        } else {
            System.out.println("Merek tidak boleh kosong!");
        }
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        if (warna != null && !warna.isEmpty()) {
            this.warna = warna;
        } else {
            System.out.println("Warna tidak boleh kosong!");
        }
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        if (mesin != null) {
            this.mesin = mesin;
        } else {
            System.out.println("Mesin tidak boleh null!");
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("MaxSpeed harus lebih dari 0!");
        }
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan(int tambah) {
        if (tambah > 0) {
            kecepatan += tambah;

            if (kecepatan > maxSpeed) {
                kecepatan = maxSpeed;
            }
        }
    }

    public void kurangiKecepatan(int kurang) {
        if (kurang > 0) {
            kecepatan -= kurang;

            if (kecepatan < 0) {
                kecepatan = 0;
            }
        }
    }

    public void tampilkanInfo() {
        System.out.println("=== DATA SEPEDA MOTOR ===");
        System.out.println("Merek       : " + merek);
        System.out.println("Warna       : " + warna);
        System.out.println("Max Speed   : " + maxSpeed + " km/jam");
        System.out.println("Kecepatan   : " + kecepatan + " km/jam");

        if (mesin != null) {
            mesin.tampilkanInfo();
        } else {
            System.out.println("Mesin       : Belum terpasang");
        }
    }
}

package Pertemuan10.Percobaan3;

public class Parkir {
    public int hitungBiaya(Kendaraan k, int lamaJam) {
        int biaya = k.getTarifPerJam() * lamaJam;
        
        if (k instanceof Mobil mobil) {
            biaya += mobil.getBiayaValet();
        } else if (k instanceof Motor motor) {
            biaya += motor.getBiayaHelm();
        }
    
        return biaya;
    }
}

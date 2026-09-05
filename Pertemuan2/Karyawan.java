package Pertemuan2;

public class Karyawan {
    public int id;
    public String nama;
    public String jk;
    public String jabatan;
    public int gaji;

    public void tampilData() {
        System.out.println("ID                                  : "+id);
        System.out.println("nama                                : "+nama);
        System.out.println("Jenis Kelamin (Laki-laki/Perempuan) : "+jk);
        System.out.println("Jabatan                             : "+jabatan);
    }
}

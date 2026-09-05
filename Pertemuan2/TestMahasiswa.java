package Pertemuan2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim = "101"    ;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();

        mhs2.nim = "254107020117";
        mhs2.nama = "Nerazuriancta Purnama Syah Putri";
        mhs2.alamat = "Jl. Kali Ciliwung Probolinggo";
        mhs2.kelas = "2D";
        mhs2.tampilBiodata();

        mhs3.nim = "254107020116";
        mhs3.nama = "Rowerchan";
        mhs3.alamat = "Jl. Ronggojalu Probolinggo";
        mhs3.kelas = "2A";
        mhs3.tampilBiodata();
    }
}
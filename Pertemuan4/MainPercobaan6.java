package Pertemuan4;

public class MainPercobaan6 {
    public static void main(String[] args) {
        Printer printer = new Printer("Epson L3110");
        Laptop6 laptop = new Laptop6("Thinkpad", printer);

        laptop.cetakDokumen("Laporan.pdf");
    }
}

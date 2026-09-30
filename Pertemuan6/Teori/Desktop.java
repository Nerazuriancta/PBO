package Pertemuan6.Teori;

public class Desktop extends Komputer{
    protected String printer;

    public Desktop(String printer) {
        this.printer = printer;
    }

    public Desktop (String printer, String merk, int kapasitasMemori, double kecepatanCpu) {
        super(merk, kapasitasMemori, kecepatanCpu);
        this.printer = printer;
    }

    @Override 
    public void showInfo() {
        super.showInfo();
        System.out.println("Printer             : "+printer);
    }
}
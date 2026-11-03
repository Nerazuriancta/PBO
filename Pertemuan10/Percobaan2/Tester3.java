package Pertemuan10.Percobaan2;

public class Tester3 {
    public static void main(String[] args) {
        RegularStudent rStd = new RegularStudent("Rina", 400);
        ScholarshipStudent sStd = new ScholarshipStudent("Bayu", "KIP Kuliah");
        LabRental lab = new LabRental(3, "LAB-JARINGAN");

        // Array Heterogen Billable
        Billable b[] = {rStd, lab};

        // Array Heterogen Student
        Student s[] = {rStd, sStd};

        // Pemrosesan massal secara polimorfik
        for (Billable item : b) {
            System.out.println("Total tagihan: " + item.getBillAmount());
        }

        // Uji baris array yang memicu compile error
        // Student s2[] = {rStd, sStd, lab};
    }
}

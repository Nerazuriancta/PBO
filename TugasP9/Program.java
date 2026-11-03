package TugasP9;

public class Program {
    public static void main(String[] args) {
        Binatang keledai = new Keledai("Keledai", 4, "Hehehehe", "Abu-Abu");
        Binatang gorilla = new Gorilla("Gulali", 4, "Haaum Haum", "Hitam Manis");
        Binatang singa = new Singa("Cingacing", 4, "Roar Roar", "Coklat");

        keledai.displayJenis();
        keledai.displayMakan();
        keledai.displayData();
            
        System.out.println();
            
        gorilla.displayJenis();
        gorilla.displayMakan();
        gorilla.displayData();
            
        System.out.println();
            
        singa.displayJenis();
        singa.displayMakan();
        singa.displayData();
    }
}

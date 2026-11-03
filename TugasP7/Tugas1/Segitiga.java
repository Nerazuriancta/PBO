package TugasP7.Tugas1;

public class Segitiga {
    private int sudut;

    // overloading 1
    public int totalSudut(int sudut) {
        sudut = 180 - sudut;
        return sudut;
    }

    // overloading 2
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // overloading 3
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // overloading 4
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }
}

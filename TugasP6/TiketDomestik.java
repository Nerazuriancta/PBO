package TugasP6;

public class TiketDomestik extends TiketPesawat{
    protected int pajakBandara;

    public TiketDomestik() {
    }

    public TiketDomestik(TiketPesawat tiketPesawat, int pajakBandara) {
        super(tiketPesawat);
        this.pajakBandara = pajakBandara;
    }

    public void tampilDomestik() {
        super.tampilPesawat();
        System.out.println("Pajak Bandara   = " + pajakBandara);
        System.out.println("Total Bayar     = " +
                (hargaDasar + hitungBiayaBagasi() + pajakBandara));
    }
}

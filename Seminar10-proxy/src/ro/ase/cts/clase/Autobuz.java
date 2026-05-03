package ro.ase.cts.clase;

public class Autobuz implements MijlocTransport{
    private String linie;
    private int nrCalatori;

    public Autobuz(String linie, int nrCalatori) {
        this.linie = linie;
        this.nrCalatori = nrCalatori;
    }

    public String getLinie() {
        return linie;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }
    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul opreste in statie!!!");
    }
}

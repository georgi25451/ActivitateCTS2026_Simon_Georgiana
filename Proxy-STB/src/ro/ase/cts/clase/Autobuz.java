package ro.ase.cts.clase;

public class Autobuz implements AutobuzAbstract{
    private int nrCalatori;
    private String nume;

    public Autobuz(int nrCalatori, String nume) {
        this.nrCalatori = nrCalatori;
        this.nume = nume;
    }

    @Override
    public void oprire() {
        System.out.println("Autobuzul "+this.nume+" a oprit in statie.");
    }

    @Override
    public int getNrCalatori() {
        return nrCalatori;
    }
}

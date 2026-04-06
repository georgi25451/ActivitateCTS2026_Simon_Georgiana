package ro.ase.cts.clase;

public abstract class MijlocTransport {
    int linie;

    public MijlocTransport(int linie) {
        this.linie = linie;
    }

    public abstract void afisareDetalii();
}

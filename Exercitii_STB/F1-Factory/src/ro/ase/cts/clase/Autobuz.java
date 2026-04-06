package ro.ase.cts.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int linie) {
        super(linie);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Autobuz pe linia "+linie);
    }
}

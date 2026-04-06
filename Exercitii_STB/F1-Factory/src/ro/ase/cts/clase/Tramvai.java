package ro.ase.cts.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(int linie) {
        super(linie);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Tramvai pe linia "+linie);
    }
}

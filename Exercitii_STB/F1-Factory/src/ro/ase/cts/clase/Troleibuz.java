package ro.ase.cts.clase;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(int linie) {
        super(linie);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Troleibuz pe linia" + linie);
    }
}

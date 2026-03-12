package ro.ase.cts.clase;

public class Tramvai extends MijlocTransport{


    public Tramvai(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescrierer() {
        System.out.println("Tramvai"+super.toString());
    }
}

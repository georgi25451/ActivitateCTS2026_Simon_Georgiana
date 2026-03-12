package ro.ase.cts.clase;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescrierer() {
        System.out.println("troilebuz"+super.toString());
    }
}

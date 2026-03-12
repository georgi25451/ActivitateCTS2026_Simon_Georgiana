package ro.ase.cts.clase;

public class Autobuz extends  MijlocTransport{

    public Autobuz(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescrierer() {
        System.out.println("autobuz"+super.toString());

    }


}

package ro.ase.cts.clase;

public abstract class MijlocTransport {
    protected String linie;
    protected int capacitate;

    public MijlocTransport(String linie, int capacitate) {
        this.linie = linie;
        this.capacitate = capacitate;
    }

    public String getLinie() {
        return linie;
    }

    public void setLinie(String linie) {
        this.linie = linie;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    //metoda pt prototype
    public abstract MijlocTransport clone();


    //toString
    public abstract String afiseazaDetalii();
}

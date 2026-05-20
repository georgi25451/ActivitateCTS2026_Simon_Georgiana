package ro.ase.cts.clase;

public class Autobuz implements Structura{
    private String producator;
    private String numeAuto;
    private int nrLocuri;

    public Autobuz(String producator, String numeAuto, int nrLocuri) {
        this.producator = producator;
        this.numeAuto = numeAuto;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Autobuzul: "+this.numeAuto+" produs de: "+this.producator+" are: "+this.nrLocuri+" locuri.");
    }
}

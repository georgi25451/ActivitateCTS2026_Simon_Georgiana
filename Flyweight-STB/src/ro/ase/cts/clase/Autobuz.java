package ro.ase.cts.clase;

public class Autobuz {
    private String model;
    private int nrLocuri;
    private int anFabricatie;

    public Autobuz(String model, int nrLocuri, int anFabricatie) {
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.anFabricatie = anFabricatie;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }
}

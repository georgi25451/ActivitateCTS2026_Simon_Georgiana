package ro.ase.cts.clase;

public class Autobuz {
    private String model;
    
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String model, int anFabricatie, int nrLocuri) {
        this.model = model;

        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("Model='").append(model).append('\'');
        sb.append(", AnFabricatie=").append(anFabricatie);
        sb.append(", NrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    public int getNrLocuri() {
        return nrLocuri;
    }
}

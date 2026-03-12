package ro.ase.cts.clase;

public abstract class MijlocTransport {
    private String marca;
    private int linia;

    public MijlocTransport(String marca, int linia) {
        this.marca = marca;
        this.linia = linia;
    }

    public abstract void afisareDescrierer();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MijlocTransport{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", linia=").append(linia);
        sb.append('}');
        return sb.toString();
    }
}

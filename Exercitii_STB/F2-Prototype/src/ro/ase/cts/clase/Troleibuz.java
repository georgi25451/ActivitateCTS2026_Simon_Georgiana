package ro.ase.cts.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String linie, int capacitate) {
        super(linie, capacitate);
    }

    @Override
    public MijlocTransport clone() {
        return new Troleibuz(this.linie, this.capacitate);
    }

    @Override
    public String afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("linie='").append(linie).append('\'');
        sb.append(", capacitate=").append(capacitate);
        sb.append('}');
        return sb.toString();
    }
}

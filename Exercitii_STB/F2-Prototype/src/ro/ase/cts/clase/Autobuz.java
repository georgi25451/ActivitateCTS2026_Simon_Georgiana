package ro.ase.cts.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(String linie, int capacitate) {
        super(linie, capacitate);
    }

    @Override
    public MijlocTransport clone() {
        return new Autobuz(this.linie, this.capacitate);
    }

    @Override
    public String afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("linie='").append(linie).append('\'');
        sb.append(", capacitate=").append(capacitate);
        sb.append('}');
        return sb.toString();
    }


}

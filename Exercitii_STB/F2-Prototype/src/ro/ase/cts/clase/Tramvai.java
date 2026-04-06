package ro.ase.cts.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(String linie, int capacitate) {
        super(linie, capacitate);
    }

    @Override
    public MijlocTransport clone() {
        return new Tramvai(this.linie, this.capacitate);
    }


    @Override
    public String afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("linie='").append(linie).append('\'');
        sb.append(", capacitate=").append(capacitate);
        sb.append('}');
        return sb.toString();
    }
}

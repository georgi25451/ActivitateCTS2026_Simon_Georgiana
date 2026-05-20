package ro.ase.cts.clase;

public class Rezervare {
    private int nrMasa;
    private String data;

    public Rezervare(int nrMasa, String data) {
        this.nrMasa = nrMasa;
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

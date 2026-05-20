package ro.ase.cts.clase;

public class Obiectiv{
    private String muzeu;
    private String oras;

    public Obiectiv(String muzeu, String oras) {
        this.muzeu = muzeu;
        this.oras = oras;
    }

    public String getMuzeu() {
        return muzeu;
    }

    public String getOras() {
        return oras;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Obiectiv{");
        sb.append("muzeu='").append(muzeu).append('\'');
        sb.append(", oras='").append(oras).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package ro.ase.cts.clase;

public class Comanda {
    private String nume;
    private boolean verificareStoc;
    private boolean verificareAdresa;
    private boolean verificareMetoda;
    private boolean verificareValoare;

    public Comanda(String nume, boolean verificareStoc, boolean verificareAdresa, boolean verificareMetoda, boolean verificareValoare) {
        this.nume = nume;
        this.verificareStoc = verificareStoc;
        this.verificareAdresa = verificareAdresa;
        this.verificareMetoda = verificareMetoda;
        this.verificareValoare = verificareValoare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isVerificareStoc() {
        return verificareStoc;
    }

    public boolean isVerificareAdresa() {
        return verificareAdresa;
    }

    public boolean isVerificareMetoda() {
        return verificareMetoda;
    }

    public boolean isVerificareValoare() {
        return verificareValoare;
    }
}

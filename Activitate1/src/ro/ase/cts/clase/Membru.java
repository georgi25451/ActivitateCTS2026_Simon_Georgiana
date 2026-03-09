package ro.ase.cts.clase;

public abstract class Membru {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctajFidelitate;
    protected int nrCarti;
    protected String[] cartiImprumutate;

    public Membru() {
    }

    public Membru(String nume, String prenume, int varsta, int punctajFidelitate, int nrCarti, String[] cartiImprumutate) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctajFidelitate = punctajFidelitate;
        this.nrCarti = nrCarti;
        this.cartiImprumutate = cartiImprumutate;
    }

    public String getNume() {

        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getPunctajFidelitate() {
        return punctajFidelitate;
    }

    public void setPunctajFidelitate(int punctajFidelitate) {
        this.punctajFidelitate = punctajFidelitate;
    }

    public void statutPremium() {
        //inlocuim cu folosirea operatorului ternar:
        System.out.println("Membrul "+nume+" "+prenume+
                (punctajFidelitate>80 ? " " : "nu")+" a fost acceptat.");

    }

    public int getNrCarti() {
        return nrCarti;
    }

    public void setNrCarti(int nrCarti) {
        this.nrCarti = nrCarti;
    }
}

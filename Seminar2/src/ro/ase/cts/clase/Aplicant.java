package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;
    private static int punctajMinim = 80;

    public static void setPunctajMinim(int punctajMinim) {
        Aplicant.punctajMinim = punctajMinim;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }



    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void afisareStatut() {
        //daca avem var harcodate, le punem in bd/fisiere sau in atribut

        //operatorul ternar pt DRY aveam 2 if-uri

        //one screen rule pe verticala => rezolvam cu string builder
        StringBuilder sb = new StringBuilder("Aplicantul");
        sb.append(this.nume).append(" ").append(this.prenume);
        sb.append((this.punctaj > Aplicant.punctajMinim ? " " : " nu "));
        sb.append(" a fost aceptat.");
        System.out.println(sb.toString());
    }

    public int getPunctaj() {
        return this.punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public Aplicant() {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }


    public void setNrProiecte(int nrProiecte, String[] vect) {
        this.nrProiecte = nrProiecte;
        this.denumireProiect = vect;
    }

    public abstract void afisareFinantare();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aplicant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", nrProiecte=").append(nrProiecte);
        sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
        sb.append('}');
        return sb.toString();
    }
}

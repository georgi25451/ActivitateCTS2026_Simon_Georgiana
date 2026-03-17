package ro.ase.cts.clase;

public abstract class Supa {
    private float pret;
    private int timpDePrepare;

    public Supa(float pret, int timpDePrepare) {
        this.pret = pret;
        this.timpDePrepare = timpDePrepare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append("pret=").append(pret);
        sb.append(", timpDePrepare=").append(timpDePrepare);
        return sb.toString();
    }

    public abstract void afisareDescriere();


}

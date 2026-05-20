package ro.ase.cts.clase;

public class Produs implements Structura{
    private String nume;
    private double pret;

    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" costa: "+this.pret);
    }



    @Override
    public void calculeazaPretTotal() {
        System.out.println(this.pret);

    }

    @Override
    public double getPret() {
        return this.pret;
    }
}

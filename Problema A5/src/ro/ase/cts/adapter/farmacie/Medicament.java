package ro.ase.cts.adapter.farmacie;

public class Medicament {
    private String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    public void cumparaMedicament() {
        System.out.println("Este cumparat med " + this.nume + " de la farmacie");
    }
}

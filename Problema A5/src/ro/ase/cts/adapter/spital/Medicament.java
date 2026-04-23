package ro.ase.cts.adapter.spital;

public class Medicament {
    private String numeMedicament;
    private float pretMedicament;

    public Medicament(String numeMedicament, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public void achizitioneazaMedicament() {
        if (prezintaReteta()) {
            System.out.println("Este achizionat medicamentul: " + this.numeMedicament + " la pretul de " + this.pretMedicament);
        } else {
            System.out.println("Pt med " + this.numeMedicament + " este nevoie de reteta");
        }
    }

    public boolean prezintaReteta() {
       return this.numeMedicament.contains("reteta");
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }
}

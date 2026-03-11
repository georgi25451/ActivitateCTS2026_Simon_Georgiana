package ro.ase.cts.clase;

import java.util.Arrays;

public class MedicRezident extends ParticipantProgram{
    private String specializare;
    private int salariu;
    private static int suma=25;

    public MedicRezident() {
        super();
    }

    public MedicRezident(String nume, String prenume, int varsta, int punctaj, int nrActivitati,
                         String[] activitati, int salariu, String specializare) {
        super(nume, prenume, varsta, punctaj, nrActivitati, activitati);
        this.salariu = salariu;
        this.specializare = specializare;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public void afiseazaSuma() {
        System.out.println("Medicul rezident " + this.nume + " " + this.prenume + " primeste " + MedicRezident.suma + " euro/zi.");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicRezident{");
        sb.append("specializare='").append(specializare).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", nrActivitati=").append(nrActivitati);
        sb.append(", activitati=").append(Arrays.toString(activitati));
        sb.append('}');
        return sb.toString();
    }
}

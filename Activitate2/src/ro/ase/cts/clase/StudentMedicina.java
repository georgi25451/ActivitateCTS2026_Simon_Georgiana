package ro.ase.cts.clase;

import java.util.Arrays;

public class StudentMedicina extends ParticipantProgram{
    private String universitate;
    private int anStudiu;
    private static int suma=20;

    public StudentMedicina() {
        super();
    }

    public StudentMedicina(String nume, String prenume, int varsta, int punctaj, int nrActivitati,
                           String[] activitati, String universitate, int anStudiu) {
        super(nume, prenume, varsta, punctaj, nrActivitati, activitati);
        this.universitate = universitate;
        this.anStudiu = anStudiu;
    }

    public String getUniversitate() {
        return universitate;
    }

    public void setUniversitate(String universitate) {
        this.universitate = universitate;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }

    public void afiseazaSuma() {
        System.out.println("Studentul " + this.nume + " " + this.prenume + " primeste " + StudentMedicina.suma + " euro/zi.");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentMedicina{");
        sb.append("universitate='").append(universitate).append('\'');
        sb.append(", anStudiu=").append(anStudiu);
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

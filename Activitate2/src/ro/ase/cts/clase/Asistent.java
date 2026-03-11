package ro.ase.cts.clase;

import java.util.Arrays;

public class Asistent extends ParticipantProgram{
    private String sectie;
    private String tura;
    private static int suma=15;

    public Asistent() {
        super();
    }

    public Asistent(String nume, String prenume, int varsta, int punctaj, int nrActivitati,
                    String[] activitati, String sectie, String tura) {
        super(nume, prenume, varsta, punctaj, nrActivitati, activitati);
        this.sectie = sectie;
        this.tura = tura;
    }

    public String getSectie() {
        return sectie;
    }

    public void setSectie(String sectie) {
        this.sectie = sectie;
    }

    public String getTura() {
        return tura;
    }

    public void setTura(String tura) {
        this.tura = tura;
    }

    public void afiseazaSuma() {
        System.out.println("Asistentul " + this.nume + " " + this.prenume + " primeste " + Asistent.suma + " euro/zi.");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("sectie='").append(sectie).append('\'');
        sb.append(", tura='").append(tura).append('\'');
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

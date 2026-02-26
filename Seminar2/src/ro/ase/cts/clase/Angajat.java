package ro.ase.cts.clase;

import java.io.PrintStream;
import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;

    public String getOcupatie() {
        return this.ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public int getSalariu() {
        return this.salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumire_Proiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public Angajat() {
    }

    public String toString() {
        String var10000 = this.nume;
        return "Angajat: Nume=" + var10000 + ", Prenume=" + this.prenume + ", Varsta=" + this.varsta + ", Punctaj=" + this.punctaj + ", Nr_proiecte=" + this.nr_proiecte + ", DenumireProiect=" + Arrays.toString(this.denumireProiect) + "Ocupatie=" + this.ocupatie + ", salariu=" + this.salariu;
    }

    public int finantare() {
        int s = 10;
        PrintStream var10000 = System.out;
        String var10001 = this.getNume();
        var10000.println("Angajatul " + var10001 + " " + this.getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }
}

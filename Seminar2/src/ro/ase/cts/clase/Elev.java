package ro.ase.cts.clase;

import java.io.PrintStream;
import java.util.Arrays;

public class Elev extends Aplicant {
    private int clasa;
    private String tutore;

    public int getClasa() {
        return this.clasa;
    }

    public void setClasa(int i) {
        this.clasa = i;
    }

    public String getTutore() {
        return this.tutore;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    public String toString() {
        String var10000 = this.nume;
        return "Elev: Nume=" + var10000 + ", Prenume=" + this.prenume + ", Varsta=" + this.varsta + ", Punctaj=" + this.punctaj + ", Nr_proiecte=" + this.nr_proiecte + ", DenumireProiect=" + Arrays.toString(this.denumireProiect) + "Clasa=" + this.clasa + ", Tutore=" + this.tutore;
    }

    public Elev() {
    }

    public Elev(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    public int finantare() {
        int s = 30;
        PrintStream var10000 = System.out;
        String var10001 = this.getNume();
        var10000.println("Angajatul " + var10001 + " " + this.getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }
}

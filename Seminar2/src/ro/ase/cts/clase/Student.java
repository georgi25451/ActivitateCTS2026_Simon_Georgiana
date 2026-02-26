
package ro.ase.cts.clase;

import java.io.PrintStream;
import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;

    public String getFacultate() {
        return this.facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAn_studii() {
        return this.an_studii;
    }

    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }

    public Student() {
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.facultate = facultate;
        this.an_studii = an_studii;
    }

    public String toString() {
        String var10000 = this.nume;
        return "Student: Nume=" + var10000 + ", Prenume=" + this.prenume + ", Varsta=" + this.varsta + ", Punctaj=" + this.punctaj + ", Nr_proiecte=" + this.nr_proiecte + ", DenumireProiect=" + Arrays.toString(this.denumireProiect) + "Facultate=" + this.facultate + ", An_studii=" + this.an_studii;
    }

    public int finantare() {
        int s = 20;
        PrintStream var10000 = System.out;
        String var10001 = this.getNume();
        var10000.println("Studentul " + var10001 + " " + this.getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }
}

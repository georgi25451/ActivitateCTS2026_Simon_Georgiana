
package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;
    private static int sumaFinantare=30;

    public static void setSumaFinantare(int sumaFinantare) {
        Student.sumaFinantare = sumaFinantare;
    }



    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }


    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    public Student() {
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = an_studii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append(super.toString());
        sb.append("facultate='").append(facultate).append('\'');
        sb.append(", anStudii=").append(anStudii);
        sb.append('}');
        return sb.toString();
    }

    public void afisareFinantare() {
        System.out.println("Studentul " + getNume() + " " + this.getPrenume() + " primeste" + Student.sumaFinantare + " Euro/zi in proiect.");

    }
}

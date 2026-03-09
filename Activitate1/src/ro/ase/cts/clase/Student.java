package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Membru {
    protected String facultate;
    protected int anStudiu;
    private static int valoareTaxa=2;

    public Student() {
        super();
    }

    public Student(String nume, String prenume, int varsta, int punctajFidelitate,
                         int nrCarti, String[] cartiImprumutate, String facultate, int anStudiu) {
        super(nume, prenume, varsta, punctajFidelitate, nrCarti, cartiImprumutate);
        this.facultate = facultate;
        this.anStudiu = anStudiu;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("facultate='").append(facultate).append('\'');
        sb.append(", anStudiu=").append(anStudiu);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctajFidelitate=").append(punctajFidelitate);
        sb.append(", nrCarti=").append(nrCarti);
        sb.append(", cartiImprumutate=").append(Arrays.toString(cartiImprumutate));
        sb.append('}');
        return sb.toString();
    }

   public void afisareInformatiiTaxa() {
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " plateste " + Student.valoareTaxa + " lei/zi.");

    }
}

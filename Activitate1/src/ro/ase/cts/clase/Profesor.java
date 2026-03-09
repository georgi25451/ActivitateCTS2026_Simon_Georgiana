package ro.ase.cts.clase;

import java.util.Arrays;

public class Profesor extends Membru {
    private String departament;
    private int salariu;
    private static int valoareTaxa=3;

    public Profesor() {
        super();
    }

    public Profesor(String nume, String prenume, int varsta, int punctajFidelitate,
                          int nrCarti, String[] cartiImprumutate, int salariu, String departament) {
        super(nume, prenume, varsta, punctajFidelitate, nrCarti, cartiImprumutate);
        this.salariu = salariu;
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Profesor{");
        sb.append("departament='").append(departament).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctajFidelitate=").append(punctajFidelitate);
        sb.append(", nrCarti=").append(nrCarti);
        sb.append(", cartiImprumutate=").append(Arrays.toString(cartiImprumutate));
        sb.append('}');
        return sb.toString();
    }

   public  void afisareInformatiiTaxa() {
        System.out.println("Profesorul " + getNume() + " " + getPrenume() + " plateste " + Profesor.valoareTaxa + " lei/zi.");

    }
}

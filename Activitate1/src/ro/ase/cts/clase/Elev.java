package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Membru {
    private int clasa;
    private String profesorIndrumator;
    private static int valoareTaxa=1;

    public Elev() {
        super();
    }

    public Elev(String nume, String prenume, int varsta, int punctajFidelitate,
                      int nrCarti, String[] cartiImprumutate, int clasa, String profesorIndrumator) {
        super(nume, prenume, varsta, punctajFidelitate, nrCarti, cartiImprumutate);
        this.clasa = clasa;
        this.profesorIndrumator = profesorIndrumator;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public String getProfesorIndrumator() {
        return profesorIndrumator;
    }

    public void setProfesorIndrumator(String profesorIndrumator) {
        this.profesorIndrumator = profesorIndrumator;
    }

   //era incalcat one screen rule, am corectat o cu StringBuilder (pt lizibilitate)
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elev{");
        sb.append("clasa=").append(clasa);
        sb.append(", profesorIndrumator='").append(profesorIndrumator).append('\'');
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

        //era incalcat single responsability, deoarece returna si afisa in acelasi timp, facea 2 lucruri deodata
        System.out.println("Profesorul " + getNume() + " " + getPrenume() + " plateste " + Elev.valoareTaxa + " leu/zi.");

    }
}


package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;
    private static int sumaFinanate = 10;

    //setter static
    public static void setSumaFinanate(int sumaFinanate) {
        Angajat.sumaFinanate = sumaFinanate;
    }



    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
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
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append(super.toString());
        sb.append("ocupatie=' ").append(ocupatie).append('\'');
        sb.append("salariu=' ").append(salariu).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void afisareFinantare() {
        //se incalcau DRY, single responsability(returna si afisa)


        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + Angajat.sumaFinanate + " Euro/zi in proiect.");
        //Angajat.sumaFinantare deoarece e static, mergea si cu this, dar voiam sa aratam ca e al obiectului
    }
}

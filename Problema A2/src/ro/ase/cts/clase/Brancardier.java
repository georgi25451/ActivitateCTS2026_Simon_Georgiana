package ro.ase.cts.clase;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, String prenume, float salariu) {
        super(nume, prenume, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Brancardierul face parte din " + super.toString());
    }
}

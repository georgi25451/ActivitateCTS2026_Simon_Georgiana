package ro.ase.cts.clase;

public class Medic extends PersonalSpital {

    public Medic(String nume, String prenume, float salariu) {
        super(nume, prenume, salariu);

    }

    @Override
    public void afisareDescriere() {
        System.out.println("Medicul face parte din " + super.toString());
    }
}

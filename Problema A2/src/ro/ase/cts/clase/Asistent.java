package ro.ase.cts.clase;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, String prenume, float salariu) {
        super(nume, prenume, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Asistentul face parte din " + super.toString());
    }
}

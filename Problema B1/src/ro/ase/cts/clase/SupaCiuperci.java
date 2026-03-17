package ro.ase.cts.clase;

public class SupaCiuperci extends Supa{

    public SupaCiuperci(float pret, int timpDePrepare) {
        super(pret, timpDePrepare);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de ciuperci "+super.toString());
    }
}

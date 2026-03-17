package ro.ase.cts.clase;

public class SupaLegume extends Supa{

    public SupaLegume(float pret, int timpDePrepare) {
        super(pret, timpDePrepare);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de legume "+super.toString());
    }
}

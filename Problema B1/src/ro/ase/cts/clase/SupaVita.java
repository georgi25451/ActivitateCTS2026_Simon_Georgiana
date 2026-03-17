package ro.ase.cts.clase;

public class SupaVita extends Supa{
    public SupaVita(float pret, int timpDePrepare) {
        super(pret, timpDePrepare);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de vita "+super.toString());
    }
}

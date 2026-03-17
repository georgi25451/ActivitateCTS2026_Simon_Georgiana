package ro.ase.cts.fabrica;

import ro.ase.cts.clase.Supa;
import ro.ase.cts.clase.SupaCiuperci;
import ro.ase.cts.clase.SupaLegume;
import ro.ase.cts.clase.SupaVita;

public class FabricaSupa {
    public Supa  creareSupa(SupaType tip, float pret, int timpPreparare)
    {
        switch (tip)
        {
            case CIUPERCI:
                return new SupaCiuperci(pret, timpPreparare);
            case LEGUME:
                return new SupaLegume(pret, timpPreparare);
            case VITA:
                return new SupaVita(pret, timpPreparare);
            default: return null;
        }
    }

}

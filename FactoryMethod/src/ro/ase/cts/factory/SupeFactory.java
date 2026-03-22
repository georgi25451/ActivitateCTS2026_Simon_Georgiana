package ro.ase.cts.factory;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.SupaCiuperci;
import ro.ase.cts.clase.SupaLegume;
import ro.ase.cts.clase.SupaVita;

public class SupeFactory implements FeluriDeMancareFactory{
    @Override
    public FelDeMancare creareFelDeMancare(TipFeluriDeMancare tip) {
        return switch (tip){
            case SUPA_CIUPERCI -> new SupaCiuperci();
            case SUPA_LEGUME-> new SupaLegume();
            case SUPA_VITA -> new SupaVita();
            default -> null;
        };
    }


}

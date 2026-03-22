package ro.ase.cts.factory;

import ro.ase.cts.clase.CheeseCake;
import ro.ase.cts.clase.Clatite;
import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Papanasi;

public class DeserturiFactory implements FeluriDeMancareFactory{

    @Override
    public FelDeMancare creareFelDeMancare(TipFeluriDeMancare tip) {
        return switch (tip){
            case CLATITE->new Clatite();
            case PAPANASI -> new Papanasi();
            case CHEESECAKE-> new CheeseCake();
            default -> null;
        };
    }
}

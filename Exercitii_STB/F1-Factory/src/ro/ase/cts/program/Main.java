package ro.ase.cts.program;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.fabrica.Fabrica;
import ro.ase.cts.fabrica.Tip;

public class Main {
    public static void main(String[] args)
    {
        Fabrica fabrica=new Fabrica();

        MijlocTransport autobuz= fabrica.getMijlocTransport(335, Tip.AUTOBUZ);
        MijlocTransport tramvai= fabrica.getMijlocTransport(10, Tip.TRAMVAI);
        MijlocTransport troleibuz=fabrica.getMijlocTransport(40, Tip.TROLEIBUZ);

        autobuz.afisareDetalii();
        tramvai.afisareDetalii();
        troleibuz.afisareDetalii();
    }
}

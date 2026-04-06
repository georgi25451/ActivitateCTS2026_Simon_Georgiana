package ro.ase.cts.fabrica;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.Tramvai;
import ro.ase.cts.clase.Troleibuz;

public class Fabrica {
    public MijlocTransport getMijlocTransport(int linie, Tip tip)
    {
        if(tip==Tip.AUTOBUZ)
        {
            return new Autobuz(linie);
        }else if(tip==Tip.TRAMVAI)
        {
            return new Tramvai(linie);
        }else if(tip==Tip.TROLEIBUZ)
        {
            return new Troleibuz(linie);
        }else return null;
    }
}

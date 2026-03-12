package ro.ase.cts.fabrica;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.Tramvai;
import ro.ase.cts.clase.Troleibuz;

public class MijlocTransportFactory {
    public MijlocTransport getMijlocTransport(String marca, int linie, MijlocTransportType tip)

    {
        if(tip==MijlocTransportType.AUTOBUZ)
            return new Autobuz(marca, linie);
        if(tip==MijlocTransportType.TRAMVAI)
            return new Tramvai(marca, linie);
        if(tip==MijlocTransportType.TROLEIBUZ)
            return new Troleibuz(marca, linie);


      return null;

    }
}

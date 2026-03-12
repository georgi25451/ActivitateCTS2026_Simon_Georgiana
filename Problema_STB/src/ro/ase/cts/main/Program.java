package ro.ase.cts.main;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.fabrica.MijlocTransportFactory;
import ro.ase.cts.fabrica.MijlocTransportType;

public class Program {

    public static void afisareMijlocTransport(MijlocTransport m)
    {
        m.afisareDescrierer();
    }


    public static void main(String[] args)
    {
        MijlocTransportFactory factory=new MijlocTransportFactory();

        MijlocTransport autobuz= factory.getMijlocTransport("Mercedes", 432, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramavai= factory.getMijlocTransport("bmw", 10, MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuz= factory.getMijlocTransport("vw", 42, MijlocTransportType.TROLEIBUZ);

        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(tramavai);
        afisareMijlocTransport(troleibuz);





    }

}

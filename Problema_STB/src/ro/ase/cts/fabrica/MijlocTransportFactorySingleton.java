package ro.ase.cts.fabrica;

public class MijlocTransportFactorySingleton {
    public static MijlocTransportFactory instance;
    public static MijlocTransportFactory getInstance()
    {
        if(instance==null)
        {
            instance=new MijlocTransportFactory();
        }
        return  instance;
    }

}

package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    private Map<Integer, LinieTransport> lista=new HashMap<>();

    public LinieFactory()
    {

    }

    public LinieTransport getLinieDeTransport(int cheie, String primaStatie, String ultimaStatie)
    {
        if(!lista.containsKey(cheie))
        {
            lista.put(cheie, new Linie(cheie, primaStatie, ultimaStatie));
        }
        return lista.get(cheie);
    }
}

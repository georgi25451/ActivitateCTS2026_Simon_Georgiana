package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {
    private Map<String, ClientAbstract> lista=new HashMap<>();

    public ClientFactory() {
    }

    public ClientAbstract getClient(String cheieNume, String nrTel )
    {
        if(!lista.containsKey(cheieNume))
        {
            lista.put(cheieNume, new Client(cheieNume, nrTel));
        }
        return lista.get(cheieNume);
    }

}

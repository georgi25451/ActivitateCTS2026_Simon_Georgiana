package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    //factory-ul folosim Map
    //map, hashMap
    private Map<Integer,LinieDeTransport> listaLinii = new HashMap<>();

    public LinieFactory() {
    }
    public LinieDeTransport getLinieDeTransport(int cheie,String primaStatie, String ultimaStatie){
        if(!listaLinii.containsKey(cheie)){
            listaLinii.put(cheie, (LinieDeTransport) new Linie(cheie,primaStatie,ultimaStatie));
        }
        return listaLinii.get(cheie);
    }

}
